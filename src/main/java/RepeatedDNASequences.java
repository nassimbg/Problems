import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("Duplicates")
public class RepeatedDNASequences {

   public static List<String> findRepeatedDnaSequences(String s) {
      Map<Character, Integer> hashRep = new HashMap<>(4);
      hashRep.put('A', 1);
      hashRep.put('C', 2);
      hashRep.put('G', 3);
      hashRep.put('T', 4);

      Set<Long> availableValues = new HashSet<>();
      Set<String> doubled = new HashSet<>();

      long hashValue = 0;
      StringBuilder str = new StringBuilder(10);
      double powOfTen = Math.pow(10, 9);

      int index = 0;
      while(index < s.length()) {
         if (str.length() > 0) {
            char charAt = str.charAt(0);
            str.deleteCharAt(0);
            hashValue -= (powOfTen * hashRep.get(charAt));
         }

         while (str.length() < 10 && index < s.length()) {
            char key = s.charAt(index++);
            hashValue = hashValue * 10 + hashRep.get(key);
            str.append(key);
         }

         if (availableValues.contains(hashValue)) {
            doubled.add(str.toString());
         } else {
            availableValues.add(hashValue);
         }
      }

      return new ArrayList<>(doubled);
   }
}
