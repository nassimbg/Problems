public class FirstUniqueCharacterInString {
   public static int firstUniqChar(String s) {

      int[] charsIndex = new int[26];

      for (int i = 0; i < s.length(); i++) {
         int position = positionOfChar(s.charAt(i));

         if (charsIndex[position] == 0) {
            charsIndex[position] = i + 1;
         } else if (charsIndex[position] > 0) {
            charsIndex[position] = Integer.MIN_VALUE;
         }
      }

      int minPosition = Integer.MAX_VALUE;
      for(int index : charsIndex) {
         if (index > 0) {
            minPosition = Math.min(minPosition, index - 1);
         }
      }

      return minPosition == Integer.MAX_VALUE ? -1 : minPosition;
   }

   private static int positionOfChar(char c) {
      return c - 'a';
   }
}
