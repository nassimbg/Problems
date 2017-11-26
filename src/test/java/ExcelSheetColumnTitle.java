public class ExcelSheetColumnTitle {
   public static String convertToTitle(int n) {

      StringBuilder stringBuilder = new StringBuilder();

      while(n > 0) {
         int mod = (n - 1 )% 26;
         stringBuilder.append((char) ('A' + mod));
         n= (n - mod) /26;
      }

      return stringBuilder.reverse().toString();
   }
}
