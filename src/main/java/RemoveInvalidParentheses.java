import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class RemoveInvalidParentheses {

   public static List<String> removeInvalidParentheses(String s) {

      List<String> result = new LinkedList<>();

      helper(s, 0, new ArrayDeque<>(), result);

      if (result.isEmpty()) {
         result.add("");
      }

      return result;
   }

   private static void helper(String s, int index, ArrayDeque<Character> queue, List<String> result) {
      if (s.length() == index) {

         if (isValid(queue)) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char character : queue) {
               stringBuilder.append(character);
            }

            String e = stringBuilder.toString();

            int length = e.length();
            result.removeIf(p -> p.length() < length || e.equals(p));

            if (result.isEmpty() || result.get(0).length() == length) {
               result.add(e);

            }
         }

      } else {
         char charAt = s.charAt(index);
         if ((charAt == '(' || charAt == ')' )) {
            helper(s, index + 1, queue, result);
         }


         queue.add(charAt);
         helper(s, index + 1, queue, result);
         queue.pollLast();

      }
   }

   private static boolean isValid(ArrayDeque<Character> queue) {
      int numberOfLeft =0;
      for (char character : queue) {
         if (character == '(') {
            ++numberOfLeft;
         }

         if (character == ')') {

            if (numberOfLeft-- == 0) {
               return false;
            }

         }
      }

      return numberOfLeft == 0;
   }
}
