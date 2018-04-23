public class RemoveDuplicateLetters {
    public static String removeDuplicateLetters(String s) {
        int[] characIndexTaken = new int[26];

        int numberOfUnique = 0;
       for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);

          if (characIndexTaken[charToInt(c )]++ == 0) {
             ++numberOfUnique;
          }
       }

       char[] chars = new char[numberOfUnique];
       int size = 0;
       boolean[] taken = new boolean[26];

       for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);
          int charIndexInAlpha = charToInt(c);

          if (!taken[charIndexInAlpha]) {
             while (size > 0 && chars[size - 1] >= c && characIndexTaken[charToInt(chars[size - 1])] > 0) {
                taken[charToInt(chars[size - 1])] = false;
                --size;
             }

             chars[size++] = c;
             taken[charIndexInAlpha] = true;
          }
          characIndexTaken[charIndexInAlpha]--;
       }

       return new String(chars);
    }

    private static int charToInt(char c) {
       return c - 'a';
    }
}
