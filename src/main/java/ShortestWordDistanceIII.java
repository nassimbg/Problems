public class ShortestWordDistanceIII {

   /**
    * This solution is the same soluion as {@link ShortestWordDistance#shortestDistance2(String[], String, String)}
    * but we added the condition low != high
    *
    * @param words
    * @param word1
    * @param word2
    * @return
    */
   public static int shortestDistanceIII(String[] words, String word1, String word2) {
      int shortest = Integer.MAX_VALUE;

      boolean lowIsForWord1 = true;

      int low = 0;
      int high = -1;

      while (low < words.length && high < words.length) {

         if (words[low].equals(lowIsForWord1 ? word1 : word2)) {

            if (low > high) {
               int temp = low;
               low = high;
               high = temp;
               lowIsForWord1 = !lowIsForWord1;
            }
            if (low != -1 && low != high) {
               shortest = Math.min(shortest, high - low);
            }
         }
         ++low;
      }

      return shortest;
   }
}
