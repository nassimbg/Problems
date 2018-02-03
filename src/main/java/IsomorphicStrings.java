import java.util.Arrays;

public class IsomorphicStrings {
   public static boolean isIsomorphic(String s, String t) {
      return check(s, t) && check(t, s );
   }

   private static boolean check(String s, String t) {
      int[] chars = new int[128];
      Arrays.fill(chars, Integer.MAX_VALUE);

      for (int i = 0; i < s.length(); i++) {
         int ascii = s.charAt(i);
         int mapperAscii = t.charAt(i);
         int mapping = chars[ascii];

         if (mapping == Integer.MAX_VALUE) {
            chars[ascii] = mapperAscii;
         } else if (mapperAscii != mapping){
            return false;
         }
      }

      return true;
   }
}
