public class ExcelSheetColumnNumber {
   public static int titleToNumber(String s) {
      int result = 0;
      int basePower = 1;
      for (int index = s.length() -1; index >= 0; index--) {
         result += (basePower * (s.charAt(index) - 'A' + 1));

         basePower *=26;
      }
      return result;
   }
}
