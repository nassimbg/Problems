public class AdditiveNumber {
   public static boolean isAdditiveNumber(String num) {

      return dfs(-1, -1, num, 0, false);
   }

   private static boolean dfs(int first, int second, String num, int currentIndex, boolean canBeAdditive) {

      if (currentIndex == num.length()) {
         return canBeAdditive;
      }

      boolean isFirstCharZero = num.charAt(currentIndex) == '0';

      if (first >= 0 && second >= 0) {
         int sum = first + second;

         int number = 0;
         for (int i = currentIndex; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            number = number * 10 + digit;

            if (isFirstCharZero == (number ==0) && sum == number && dfs(second, number, num, i + 1, true)) {
               return true;
            }
         }
      } else {
         int number = 0;
         for (int i = currentIndex; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            number = number * 10 + digit;

            if ( isFirstCharZero == (number ==0) && dfs(second, number, num, i + 1, canBeAdditive)) {
               return true;
            }
         }
      }

      return false;
   }
}
