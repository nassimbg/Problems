public class EditDistance {
   public static int minDistance(String word1, String word2) {

      int[] right = new int[word2.length() + 1];

      right[word2.length()] = 0;
      for (int index = word2.length() - 1; index >= 0; --index) {
         right[index] = 1 + right[index + 1];
      }

      for (int i = word1.length() - 1; i >= 0; --i) {
         int[] left = new int[word2.length() + 1];
         for (int j = word2.length(); j >= 0; --j) {

            int val = Integer.MAX_VALUE;

            if (j < word2.length()) {
               val = Math.min(1 + left[j + 1], right[j + 1] + (word1.charAt(i) == word2.charAt(j) ? 0 : 1));
            }

            left[j] = Math.min(val, 1 + right[j]);
         }

         right = left;

      }

      return right[0];
   }
}
