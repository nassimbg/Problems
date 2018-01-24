import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DifferentWaysToAddParentheses {
   public static List<Integer> diffWaysToCompute(String input) {
      List<Integer> result=new ArrayList<>();
      if(input==null||input.length()==0)  return result;
      List<String> ops=new ArrayList<>();
      for(int i=0; i<input.length(); i++){
         int j=i;
         while(j<input.length()&&Character.isDigit(input.charAt(j)))
            j++;
         String num=input.substring(i, j);
         ops.add(num);
         if(j!=input.length())   ops.add(input.substring(j, j+1));
         i=j;
      }
      result=compute(ops, 0, ops.size()-1);
      return result;
   }
   private static List<Integer> compute(List<String> ops, int lo, int hi){
      List<Integer> result=new ArrayList<>();
      if(lo==hi){
         Integer num=Integer.valueOf(ops.get(lo));
         result.add(num);
         return result;
      }
      for(int i=lo+1; i<=hi-1; i=i+2){
         String operator=ops.get(i);
         List<Integer> left=compute(ops,lo, i-1), right=compute(ops, i+1, hi);
         for(int leftNum:left)
            for(int rightNum: right){
               if(operator.equals("+"))
                  result.add(leftNum+rightNum);
               else if(operator.equals("-"))
                  result.add(leftNum-rightNum);
               else
                  result.add(leftNum*rightNum);
            }
      }
      return result;
   }


   /**
    * the below solution I tried it but not perfectly working it outputs sometime duplicate solutions check the solution in the notes using recursion
    * @param input
    * @return
    */
   public static List<Integer> diffWaysToCompute2(String input) {
      List<Integer> numbers = new ArrayList<>();
      List<Character> operations = new ArrayList<>();
      int index = 0;
      while (index < input.length()) {

         if (Character.isDigit(input.charAt(index))) {
            int number = 0;
            while (index < input.length() && Character.isDigit(input.charAt(index))) {
               number = number * 10 + (input.charAt(index++) - '0');
            }
            numbers.add(number);
            --index;
         } else{
            operations.add(input.charAt(index));
         }

         ++index;
      }

      ArrayList<Integer> result = new ArrayList<>();
      permutation(numbers, operations, new LinkedHashSet<>(), result);

      return result;
   }

   private static void permutation(List<Integer> numbers, List<Character> operations, Set<Integer> pickedOperations, List<Integer> result) {

      if (pickedOperations.size() == operations.size()) {
         List<Integer> temp = new ArrayList<>(numbers);
         int[] oppositeIndex = new int[numbers.size()];

         for (int i = 0; i < oppositeIndex.length; i++) {
            oppositeIndex[i] = i;
         }
         for (Integer pickedOperation : pickedOperations) {
            Integer firstValue = temp.get(pickedOperation);
            Integer secondValue = temp.get(pickedOperation + 1);

            int value;
            Character operation = operations.get(pickedOperation);
            if (operation == '+') {
               value = firstValue + secondValue;
            } else if (operation == '-') {
               value = firstValue - secondValue;
            } else {
               value = firstValue * secondValue;
            }

            int oppositeIndex1 = oppositeIndex[pickedOperation];
            int oppositeIndex2 = oppositeIndex[pickedOperation + 1];

            oppositeIndex[oppositeIndex1] = oppositeIndex2;
            oppositeIndex[oppositeIndex2] = oppositeIndex1;
            temp.set(oppositeIndex1, value);
            temp.set(oppositeIndex2, value);
         }
         result.add(temp.get(0));
      } else {
         for (int index = 0; index < operations.size(); index++) {
            if (!pickedOperations.contains(index)) {
               pickedOperations.add(index);
               permutation(numbers, operations, pickedOperations, result);
               pickedOperations.remove(index);
            }
         }
      }

   }
}

