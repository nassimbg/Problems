/**
 * Created by nboughannam on 6/10/2017.
 */
public class LongestSubstringWithoutRepeatingCharacters {

   public int lengthOfLongestSubstring(String s) {
      if(s == null || s.equals("")) {
         return 0;
      }

      boolean[] alphabit = new boolean[128];
      int start = 0;
      alphabit[getAlphaInNum(s, start)] = true;

      int end = 1;
      int length = 1;

      while (end < s.length()) {
         int alpha = getAlphaInNum(s, end);

         if (!alphabit[alpha]) {
            alphabit[alpha] = true;

            int currentLength = end - start + 1;

            length = Math.max(length, currentLength);
            ++end;
         } else {
            alphabit[getAlphaInNum(s, start)] = false;
            ++start;
         }
      }

      return length;
   }

   private int getAlphaInNum(String s, int end) {
      return s.charAt(end);
   }
}
