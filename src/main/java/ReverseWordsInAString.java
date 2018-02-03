public class ReverseWordsInAString {
   public static String reverseWords(String s) {
      String[] split = s.split("\\s");
      StringBuilder stringJoiner = new StringBuilder();
      for(int index = split.length - 1; index>=0; --index) {
         String str = split[index];
         if (!str.isEmpty()) {
            stringJoiner.append(str).append(" ");
         }
      }

      if(stringJoiner.length() > 0) {
         stringJoiner.deleteCharAt(stringJoiner.length() - 1);
      }

      return stringJoiner.toString();
   }
}
