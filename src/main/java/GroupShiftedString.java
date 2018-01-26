import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupShiftedString {
   public static List<List<String>> groupStrings(String[] strings) {
      Map<String, List<String>> shiftedStringGrouper = new HashMap<>();

      for (String string : strings) {
         StringBuilder diffHashValue = new StringBuilder();
         for (int charIndex = 0; charIndex < string.length() - 1; charIndex++) {
            int currentChar = string.charAt(charIndex);
            int nextChar = string.charAt(charIndex + 1);

            if (currentChar > nextChar) {
               nextChar += 26;
            }

            diffHashValue.append(nextChar - currentChar);
         }
         shiftedStringGrouper.computeIfAbsent(diffHashValue.toString(), k -> new ArrayList<>()).add(string);
      }

      return new ArrayList<>(shiftedStringGrouper.values());
   }
}

