public class ReverseVowelsOfString {
   public static String reverseVowels(String s) {

      char[] chars = s.toCharArray();

      int left =0;
      int right = s.length() - 1;

      while (left < right) {

         while (!isVowel(chars[left]) && left < right) {
            ++left;
         }

         while (!isVowel(chars[right]) && left < right) {
            --right;
         }

         if (left < right) {
            char c = chars[left];
            chars[left] = chars[right];
            chars[right] = c;
            ++left;
            --right;
         }
      }

      return new String(chars);
   }


   private static boolean isVowel(char c) {
      c = Character.toLowerCase(c);
      return c == 'a' || c =='e' || c == 'i' || c == 'o' || c =='u';
   }
}
