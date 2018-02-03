public class IntegerToEnglishWords {
   public static String numberToWords(int num) {

      if (num == 0){
         return "Zero";
      }

      String[] suffix = new String[] { "", "Thousand", "Million", "Billion" };
      String[] digitArray = new String[] { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

      String[] twoDigits = new String[]{"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

      String[] tensMultiple = new String[] {"", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"};


      String hundred = "Hundred";
      StringBuilder result = new StringBuilder();
      int threeDigitsCounter = 0;
      while(num > 0) {
         String local = "";
         int firstDigit = num % 10;
         num/=10;

         int tensDigit = num % 10;
         num/=10;

         int thirdDigit = num % 10;
         num/=10;

         if (thirdDigit > 0) {
            local += digitArray[thirdDigit] + " " + hundred;
         }

         if (tensDigit == 1) {
            local += addSpaceBefore(local) + twoDigits[tensDigit + firstDigit];
         } else {

            if (tensDigit > 1) {
               local += addSpaceBefore(local) + tensMultiple[tensDigit];
            }

            if (firstDigit > 0) {

               local += addSpaceBefore(local) + digitArray[firstDigit];
            }
         }

         if (!local.isEmpty()) {
            local += (threeDigitsCounter > 0 ? " ": "") + suffix[threeDigitsCounter] + (result.length() > 0 ? " ": "");
            result.insert(0, local);

         }
         ++threeDigitsCounter;

      }

      return result.toString();
   }

   private static String addSpaceBefore(String local) {
      return local.isEmpty() ? "" : " ";
   }
}
