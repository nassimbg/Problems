import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

   public static String intToRoman(int num) {
      if (num < 1 || num > 3999) {
         throw new IllegalStateException();
      }

      Map<Integer, Character> symbolValueMap = intializeSymbolValueMap();

      StringBuilder resultingString = new StringBuilder();

      int powerTen = 1;
      while (num >= powerTen) {

         int digit = (num / powerTen) % 10;

         if (digit != 0) {
            int val = digit * powerTen;

            Character character = symbolValueMap.get(val);

            //if not exactly equal to anything in the map
            if (character == null) {
               character = symbolValueMap.get(val + powerTen);

               //if val + 1 is not equal to anything in the map
               if (character == null) {

                  character = symbolValueMap.get(powerTen);
                  int limit = digit > 5 ? digit - 5 : digit;
                  for (int i = 0; i < limit; i++) {
                     resultingString.append(character);
                  }

                  if(digit > 5) {
                     resultingString.append(symbolValueMap.get(5 * powerTen));
                  }
               } else {
                  resultingString.append(character).append(symbolValueMap.get(powerTen));
               }
            } else {
               resultingString.append(character);
            }
         }
         powerTen*=10;
      }

      return resultingString.reverse().toString();
   }

   private static Map<Integer, Character> intializeSymbolValueMap() {
      Map<Integer, Character> symbolValueMap = new HashMap<>();
      symbolValueMap.put(1, 'I');
      symbolValueMap.put(5, 'V');
      symbolValueMap.put(10, 'X');
      symbolValueMap.put(50, 'L');
      symbolValueMap.put(100, 'C');
      symbolValueMap.put(500, 'D');
      symbolValueMap.put(1000, 'M');

      return symbolValueMap;
   }
}
