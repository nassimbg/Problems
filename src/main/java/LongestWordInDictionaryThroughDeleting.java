import java.util.List;

public class LongestWordInDictionaryThroughDeleting {
   public static String findLongestWord(String s, List<String> d) {
      String max = "";
      int maxSize = 0;

      for (String s1 : d) {

         int firstPointer = 0;
         int lastPointer = 0;

         int matchedSize = 0;
         while (firstPointer < s.length() && lastPointer < s1.length()) {
            if (s.charAt(firstPointer) == s1.charAt(lastPointer)) {
               firstPointer++;
               lastPointer++;
               matchedSize++;
            } else {
               firstPointer++;
            }
         }

         if (matchedSize == s1.length() && (matchedSize > maxSize ||  (matchedSize == maxSize &&max.compareTo(s1) > 0))) {
            max = s1;
            maxSize = matchedSize;
         }
      }

      return max;
   }
}
