public class DecodeString {

   private int index = 0;
   public String decodeString(String s) {
      return decodeCurrentLevel(s);
   }


   private String decodeCurrentLevel(String s) {
      StringBuilder stringBuilder = new StringBuilder();

      int repeat = 0;
      while (index < s.length() && s.charAt(index) != ']') {
         char c = s.charAt(index);
         if (Character.isDigit(c)) {

            repeat = repeat * 10 +  (c - '0');
         } else if (c == '[') {
            ++index;
            String childString = decodeCurrentLevel(s);
            for (int i = 0; i < repeat; i++) {
               stringBuilder.append(childString);
            }
            repeat = 0;

         } else {
            stringBuilder.append(c);
         }

         ++index;
      }

      return stringBuilder.toString();
   }
}
