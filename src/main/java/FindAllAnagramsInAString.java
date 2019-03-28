import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {
   public static List<Integer> findAnagrams(String s, String p) {
      List<Integer> result = new ArrayList<>();

      char[] originalChars = new char[26];
      int originalDistinctChars = 0;
      for (int index = 0; index < p.length(); index++) {
         char c = p.charAt(index);

         int currentCharCount = originalChars[c - 'a']++;

         if (currentCharCount == 0) {
            originalDistinctChars++;
         }
      }

      int start = 0;
      int end = 0;

      int windowDistinctValues = 0;
      char[] windowChars = new char[26];

      while (end < s.length()) {
         while (end < s.length() && end - start + 1 <= p.length()) {
            char c = s.charAt(end);
            int currentCharCount = ++windowChars[c - 'a'];

            if (currentCharCount == originalChars[c - 'a']) {
               windowDistinctValues++;
            }
            end++;
         }

         if (windowDistinctValues == originalDistinctChars) {
            result.add(start);
         }

         char cAtStart = s.charAt(start);
         if (windowChars[cAtStart - 'a']-- == originalChars[cAtStart - 'a']) {
            windowDistinctValues--;
         }

         start++;
      }

      return result;
   }
}
