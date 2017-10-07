public class CountAndSay {

   public static String countAndSay(int n) {
      String value = "1";

      for (int iteration = 1; iteration < n; iteration++) {
         value = perIterationValue(value);
      }
      return value;
   }

   private static String perIterationValue(String value) {
      StringBuilder stringBuilder = new StringBuilder();
      char firstChar = value.charAt(0);
      int counter = 1;

      for (int index = 1; index < value.length(); index++) {
         char currentChar = value.charAt(index);
         if (currentChar == firstChar) {
            ++counter;
         } else {
            stringBuilder.append(counter).append(firstChar);
            counter = 1;
            firstChar = currentChar;
         }
      }
      stringBuilder.append(counter).append(firstChar);

      return stringBuilder.toString();
   }
}
