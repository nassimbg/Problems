public class GuessNumberHigherOrLower {

   private final int hiddenNumber;

   GuessNumberHigherOrLower(int hiddenNumber) {
      this.hiddenNumber = hiddenNumber;
   }

   public int guessNumber(int n) {
      int start = 1;
      int end = n;

      while (start <= end) {
         int mid = start + ((end-start) >>1);

         int answer = guess(mid);
         if (answer == 0) {
            return answer;
         } else if (answer == -1) {
            end = answer -1;
         } else {
            start = answer + 1;
         }
      }

      return start + 1;
   }

   private int guess(int value) {
      return Integer.compare(this.hiddenNumber, value);
   }

}
