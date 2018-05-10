import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeStringKDistanceApart {
   static String solution(String str, int k) {
      int[] freqOfChars = new int[26];

      for (int index = 0; index < str.length(); index++) {
         freqOfChars[transformLowerLetterToIndex(str.charAt(index))]++;
      }

      PriorityQueue<CharFreq> maxQueue = new PriorityQueue<>(Comparator.<CharFreq>comparingInt(kar -> kar.freq).reversed());

      for (int index = 0; index < freqOfChars.length; index++) {
         if (freqOfChars[index] > 0) {
            maxQueue.add(new CharFreq(index, freqOfChars[index]));
         }
      }

      Map<Integer, CharFreq> charsInRange = new HashMap<>();

      StringBuilder result = new StringBuilder();

      while (!maxQueue.isEmpty()) {
         CharFreq currentChar = maxQueue.poll();

         result.append(transformIndexToChar(currentChar.kar));
         if (currentChar.decrement()) {
            charsInRange.put(currentChar.kar, currentChar);
         }

         if (result.length() >= k) {
            char firstCharInWindow = result.charAt(result.length() - k);
            CharFreq removedChar = charsInRange.remove(transformLowerLetterToIndex(firstCharInWindow));
            if (removedChar != null) {
               maxQueue.add(removedChar);
            }
         }
      }

      return  !charsInRange.isEmpty() ? "" : result.toString();
   }

   private static class CharFreq {
      int kar;
      int freq;

      CharFreq(int kar, int freq) {
         this.kar = kar;
         this.freq = freq;
      }

      boolean decrement() {
         return --freq > 0;
      }
   }


   private static int transformLowerLetterToIndex(char c) {
      return c - 'a';
   }

   private static char transformIndexToChar(int value) {
      return (char) ('a' + value);
   }
}
