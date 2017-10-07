import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

   public static List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> anagrams = new HashMap<>();
      for (int index = 0; index < strs.length; index++) {
         String str = strs[index];

         char[] chars = str.toCharArray();
         Arrays.sort(chars);
         String s = new String(chars);
         
         anagrams.computeIfAbsent(s, k -> new ArrayList<>()).add(str);

      }

      return new ArrayList<>(anagrams.values());
   }
}
