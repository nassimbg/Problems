import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateReversePolishNotation {

   public static int evalRPN(String[] tokens) {
      Deque<Integer> stack = new ArrayDeque<>();

      for (int index = 0; index < tokens.length; index++) {
         String token = tokens[index];
         int answer;
         switch (token) {
            case "+": {
               Integer secondOperator = stack.pollLast();
               Integer firstOperator = stack.pollLast();
               answer = firstOperator + secondOperator;
               break;
            }
            case "-": {
               Integer secondOperator = stack.pollLast();
               Integer firstOperator = stack.pollLast();
               answer = firstOperator - secondOperator;
               break;
            }
            case "*": {
               Integer secondOperator = stack.pollLast();
               Integer firstOperator = stack.pollLast();
               answer = firstOperator * secondOperator;
               break;
            }
            case "/": {
               Integer secondOperator = stack.pollLast();
               Integer firstOperator = stack.pollLast();
               answer = firstOperator / secondOperator;
               break;
            }
            default:
               answer = Integer.parseInt(token);
               break;
         }
         stack.addLast(answer);
      }

      return stack.pollLast();
   }
}
