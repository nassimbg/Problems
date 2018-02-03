public class ShortestWordDistance {

   /**
    * There solution
    * @param words
    * @param word1
    * @param word2
    * @return
    */
   public int shortestDistance(String[] words, String word1, String word2) {
      int m=-1;
      int n=-1;

      int min = Integer.MAX_VALUE;

      for(int i=0; i<words.length; i++){
         String s = words[i];
         if(word1.equals(s)){
            m = i;
            if(n!=-1)
               min = Math.min(min, m-n);
         }else if(word2.equals(s)){
            n = i;
            if(m!=-1)
               min = Math.min(min, n-m);
         }
      }

      return min;
   }

   /**
    * My solution
    * @param words
    * @param word1
    * @param word2
    * @return
    */
   public static int shortestDistance2(String[] words, String word1, String word2) {
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
            if (low != -1) {
               shortest = Math.min(shortest, high - low);
            }
         }
         ++low;
      }

      return shortest;
   }



}
