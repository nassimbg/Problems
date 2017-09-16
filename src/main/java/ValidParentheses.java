import java.util.Stack;

public class ValidParentheses {

   public static boolean isValid(String s) {
      char[] parenthesis = new char[] {'(',')','{','}','[',']'};

      Stack<Character> stack = new Stack<>();

      for (int index = 0; index < s.length(); ++index) {
         char charAt = s.charAt(index);
         if (charAt == parenthesis[0] || charAt == parenthesis[2] || charAt == parenthesis[4]) {
            stack.push(charAt);
         } else {
            for (int i = 1; i <= 5; i = i +2) {
               if (charAt == parenthesis[i] && (stack.isEmpty() || stack.pop() != parenthesis[i-1])) {
                  return false;
               }
            }
         }

      }

      return stack.isEmpty();
   }
}
