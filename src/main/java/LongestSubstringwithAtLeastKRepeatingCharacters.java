public class LongestSubstringwithAtLeastKRepeatingCharacters {

   public  int longestSubstring(String s, int k) {
      return longestRecursive(s, k, 0, s.length() - 1);
   }

   private int longestRecursive(String s, int k, int start, int end) {

      int maxLength = 0;
      if (end < start) {
         return maxLength;
      }

      int[] freqs = new int[26];
      for (int index = start; index <= end; ++index) {
         freqs[s.charAt(index) - 'a']++;
      }

      int currentStarting = start;

      for (int index = start; index <= end; index++) {
         if (freqs[s.charAt(index) - 'a'] < k) {
            maxLength = Math.max(maxLength, longestRecursive(s, k, currentStarting, index - 1));
            currentStarting = index + 1;
         }
      }

      if (currentStarting == start) {

         maxLength = end - start + 1;
      } else {
         maxLength = Math.max(maxLength, longestRecursive(s, k, currentStarting, end));
      }
      return maxLength;
   }
}
