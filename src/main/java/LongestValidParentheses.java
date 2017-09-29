public class LongestValidParentheses {

   public static int longestValidParentheses(String s) {

      if (s == null || s.equals("")) {
         return 0;
      }
      int globalMax = 0;
      int[] values = new int[s.length()];
      for (int index = 0; index < s.length(); index++) {
         char charAt = s.charAt(index);
         if (charAt == ')' && index > 0) {

            int diff = values[index - 1] + 1;
            if (index - diff >= 0 && s.charAt(index - diff) == '(') {
               values[index] = diff + 1;

               if (index - values[index] > 0) {
                  int previousValue = values[index - values[index]];
                  values[index] += previousValue;
               }
            }
         }
         globalMax = Math.max(values[index], globalMax);
      }
      return globalMax;
   }
}
