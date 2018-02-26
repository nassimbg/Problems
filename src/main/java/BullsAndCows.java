public class BullsAndCows {
   public static String getHint(String secret, String guess) {
      int[] digits = new int[10];
      int bulls = 0;
      int cows = 0;

      for (int index = 0; index < secret.length(); index++) {
         int intSecret = secret.charAt(index) - '0';
         int intGuess = guess.charAt(index) - '0';

         if (intSecret != intGuess) {
            digits[intSecret]++;
         } else {
            ++bulls;
         }
      }

      for (int index = 0; index < guess.length(); index++) {

         int intSecret = secret.charAt(index) - '0';
         int intGuess = guess.charAt(index) - '0';

          if (intSecret != intGuess && digits[intGuess] > 0) {
            ++cows;
            digits[intGuess]--;
         }
      }

      return "" + bulls + "A" + cows + "B";
   }
}
