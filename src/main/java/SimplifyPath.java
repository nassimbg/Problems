import java.util.ArrayDeque;

public class SimplifyPath {

   public static String simplifyPath(String path) {
      ArrayDeque<String> arrayDeque = new ArrayDeque<>();

      StringBuilder stringBuilder = new StringBuilder();
      for (int index = 0; index < path.length(); index++) {
         char charAt = path.charAt(index);

         if ('/' != charAt) {
            stringBuilder.append(charAt);
         }

         if (('/' == charAt || index == path.length() - 1) && stringBuilder.length() > 0) {
            String word = stringBuilder.toString();
            if ("..".equals(word)) {
               arrayDeque.pollLast();
            } else if (!".".equals(word) && word.length() > 0) {
               arrayDeque.addLast(word);
            }
            stringBuilder = new StringBuilder();
         }
      }

      stringBuilder = new StringBuilder();
      while (!arrayDeque.isEmpty()) {
         stringBuilder.append("/").append(arrayDeque.pollFirst());
      }

      return stringBuilder.length() > 0 ? stringBuilder.toString() : "/";
   }
}
