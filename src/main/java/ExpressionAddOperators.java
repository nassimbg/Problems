import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ExpressionAddOperators {

   private final static char[] operators = new char[] { '+', '-', '*' };

   public static List<String> addOperators(String num, int target) {

      List<String> result = new ArrayList<>();

      dfs(num, target, result, new ArrayDeque<>());

      return result;
   }

   private static void dfs(String num, int target, List<String> result, Deque<Integer> numbersEnd) {
      int endOfNumber = numbersEnd.isEmpty() ? 0 : numbersEnd.peekLast() + 1;
      int length = num.length();

      if (endOfNumber == length) {

            List<Integer> listOfNumbers = createListOfNumbers(num, numbersEnd);
            if (!listOfNumbers.isEmpty()) {
               dfsWithOperation(listOfNumbers, new ArrayDeque<>(), target, result);
            }
      } else {
         boolean isFirstCharZero = num.charAt(endOfNumber) == '0';
         for (int i = endOfNumber; i < length; i++) {

            if (!(isFirstCharZero && i > endOfNumber)) {
               numbersEnd.addLast(i);
               dfs(num, target, result, numbersEnd);
               numbersEnd.pollLast();
            }
         }
      }
   }

   private static List<Integer> createListOfNumbers(String num, Deque<Integer> numbersEnd) {
      int start = 0;

      List<Integer> numbers = new LinkedList<>();
      for (Integer integer : numbersEnd) {
         int nextStart = integer + 1;
         Long val = Long.valueOf(num.substring(start, nextStart));
         if (val <= Integer.MAX_VALUE) {
            numbers.add(Math.toIntExact(val));
         }
         start = nextStart;
      }
      return numbers;
   }

   private static void dfsWithOperation(List<Integer> numbers, Deque<Character> operations, int target, List<String> result) {

      if (operations.size() == numbers.size() - 1) {
         if (calculate(numbers, operations) == target) {
            result.add(createExpression(numbers, operations));
         }
      } else {
         for (char operator : operators) {
            operations.addLast(operator);
            dfsWithOperation(numbers, operations, target, result);
            operations.pollLast();
         }
      }

   }

   private static int calculate(List<Integer> numbers, Deque<Character> operations) {
      int result = 0;
      int preVal = 0;
      int currentVal;
      char currentOp = '+';

      Iterator<Character> iterator = operations.iterator();
      for (Integer number : numbers) {

         currentVal = number;

         switch (currentOp) {
            case '+':
               result += preVal;
               preVal = currentVal;
               break;
            case '-':
               result += preVal;
               preVal = -currentVal;
               break;
            case '*':
               preVal = preVal * currentVal;
               break;
         }
         if (iterator.hasNext()) {
            currentOp = iterator.next();
         }
      }

      return result + preVal;
   }

   private static String createExpression(List<Integer> numbers, Deque<Character> operations) {
      StringBuilder expression = new StringBuilder();

      Iterator<Character> characterIterator = operations.iterator();
      for (Integer number : numbers) {

         expression.append(number);

         if (characterIterator.hasNext()) {
            expression.append(characterIterator.next());
         }

      }

      return expression.toString();
   }

}
