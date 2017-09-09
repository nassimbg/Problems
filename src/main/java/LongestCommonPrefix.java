public class LongestCommonPrefix {

   /**
    * another solution for this problem is by sorting the array and then comparing the first and last => O(nlogn + k) instead of O(nk)
    * @param strs
    * @return
    */
   public static String longestCommonPrefix(String[] strs) {

      if (strs.length == 0) {
         return "";
      }

      StringBuilder commonPrefix = new StringBuilder(strs[0]);

      for (int index = 1; index < strs.length; ++index) {
         String currentString = strs[index];

         int inPrefix = 0;
         StringBuilder currentBuilder = new StringBuilder();
         while (inPrefix < commonPrefix.length() && inPrefix < currentString.length() && commonPrefix.charAt(inPrefix) == currentString.charAt(inPrefix)) {
            currentBuilder.append(commonPrefix.charAt(inPrefix));
            ++inPrefix;
         }

         commonPrefix = currentBuilder;
      }

      return commonPrefix.toString();
   }
}
