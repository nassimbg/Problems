public class NimGame {
   public static boolean canWinNim(int n) {

      boolean[] game = new boolean[] { true, true, true, false, true, true, true, false, true, true, true, false };


      return game[(n-1) % 12];
   }
}
