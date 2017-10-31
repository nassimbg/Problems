import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {

   //todo try to understand the other solutions
   public static List<String> restoreIpAddresses(String s) {
      List<List<Integer>> possibilities = new ArrayList<>();
      possibilities.add(new ArrayList<>());

      for (int index = 1; index <= s.length(); index++) {
         List<List<Integer>> newPos = new ArrayList<>();

         for (int posNumber = 0; posNumber < possibilities.size(); posNumber++) {
            List<Integer> pos = possibilities.get(posNumber);
            int lastDot = pos.size() == 0 ? 0 : pos.get(pos.size() - 1);
            char charAtLastDot = s.charAt(lastDot);
            int numberOfDots = pos.size();

            if (index - lastDot == 3) {
               int value = Integer.parseInt(s.substring(lastDot, index));
               if (value <= 255) {
                  pos.add(index);
               } else {
                  possibilities.remove(posNumber--);
               }
            } else if (index - lastDot == 1 && charAtLastDot == '0') {
               pos.add(index);
            } else {
               int remainingDots = 3 - numberOfDots;
               int atLeastNumbers = remainingDots * 3;

               int remaingValues = s.length() - index;
               if (remaingValues <= atLeastNumbers && remaingValues >= remainingDots && numberOfDots < 3) {
                  if (remainingDots == remaingValues) {
                     possibilities.remove(posNumber--);
                  }
                  List<Integer> v = new ArrayList<>(pos);
                  v.add(index);
                  newPos.add(v);
               }
            }
            if (numberOfDots > 3) {
               possibilities.remove(posNumber--);
            }
         }

         possibilities.addAll(newPos);
      }

      List<String> results = new ArrayList<>();
      for (List<Integer> possibility : possibilities) {
         if (!possibility.isEmpty()) {
            int counter = 0;
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
               if (counter < possibility.size() && possibility.get(counter) == i) {
                  ++counter;
                  stringBuilder.append('.');
               }
               stringBuilder.append(s.charAt(i));
            }
            results.add(stringBuilder.toString());
         }
      }

      return results;
   }

}
