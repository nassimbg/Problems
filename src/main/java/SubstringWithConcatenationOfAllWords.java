import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class SubstringWithConcatenationOfAllWords {

   public static List<Integer> findSubstring2(String s, String[] words) {

      List<Integer> indecies = new ArrayList<>();
      if (words.length == 0) {
         return indecies;
      }

      Arrays.sort(words);
      int refHashCode = Arrays.hashCode(words);

      int wordLength = words[0].length();
      int limit = wordLength * words.length;

      // inorder to use hash code lets put the words in a set

      for (int index = 0; index <= s.length() - limit; ++index) {

         String[] temp = new String[words.length];
         for (int subIndex = 0; subIndex< words.length; subIndex++) {
            int startingIndex = subIndex * wordLength;
            int beginIndex = index + startingIndex;
            int endIndex = beginIndex + wordLength;

            if (endIndex > s.length()) {
               return indecies;
            }
            temp[subIndex] = s.substring(beginIndex, endIndex);
         }

         Arrays.sort(temp);


         if (refHashCode == Arrays.hashCode(temp) && Arrays.equals(words, temp)) {
            indecies.add(index);
         }
      }

      return indecies;
   }

   public static List<Integer> findSubstring(String s, String[] words) {
      List<Integer> indecies = new ArrayList<>();
      if (words.length == 0) {
         return indecies;
      }

      HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
      for (String word : words) {
         stringIntegerHashMap.compute(word, (k, v) -> v==null ? 1 : ++v);
      }

      int wordLength = words[0].length();

      Queue<String> strings = new ArrayDeque<>();
      int counter = 0;
      for (int index = 0; index < words.length; ++index) {

         int beginIndex = index * wordLength;
         int endIndex = beginIndex + wordLength;

         if (endIndex > s.length()) {
            return indecies;
         }
         //todo fik t7asen iza faowatet string mano bl map de98re tnot
         String substring = s.substring(beginIndex, endIndex);
         strings.add(substring);

         Integer integer = stringIntegerHashMap.computeIfPresent(substring, (k, v) -> v == 0 ? null : --v);
         if (integer != null) {
            counter++;
         }
      }

      if (counter == words.length) {
         indecies.add(0);
      }

      for (int i = words.length; i < s.length(); i = i + wordLength) {
         String poll = strings.poll();
         Integer integer = stringIntegerHashMap.computeIfPresent(poll, (k, v) -> v == 0 ? 1 : ++v);

         if (integer!=null) {
            --counter;
         }

         int endIndex = i + wordLength;
         if (endIndex > s.length()) {
            return indecies;
         }
         String substring = s.substring(i, endIndex);
         strings.add(substring);

         integer = stringIntegerHashMap.computeIfPresent(substring, (k, v) -> v == 0 ? null : --v);
         if (integer != null) {
            counter++;
         }

         if (counter == words.length) {
            indecies.add(i);
         }
      }

      return indecies;

   }

}
