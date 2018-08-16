import java.util.ArrayDeque;
import java.util.Deque;

public class ReconstructOriginalDigitsFromEnglish {




   public static String originalDigits(String s) {
      int[] count = new int[10];
      for (int i = 0; i < s.length(); i++){
         char c = s.charAt(i);
         if (c == 'z') count[0]++;
         if (c == 'w') count[2]++;
         if (c == 'x') count[6]++;
         if (c == 's') count[7]++; //7-6
         if (c == 'g') count[8]++;
         if (c == 'u') count[4]++;
         if (c == 'f') count[5]++; //5-4
         if (c == 'h') count[3]++; //3-8
         if (c == 'i') count[9]++; //9-8-5-6
         if (c == 'o') count[1]++; //1-0-2-4
      }
      count[7] -= count[6];
      count[5] -= count[4];
      count[3] -= count[8];
      count[9] = count[9] - count[8] - count[5] - count[6];
      count[1] = count[1] - count[0] - count[2] - count[4];
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i <= 9; i++){
         for (int j = 0; j < count[i]; j++){
            sb.append(i);
         }
      }
      return sb.toString();
   }

   public static String originalDigits1(String s) {
      String[] engNumbers = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
      int[] charsFreq = new int[26];
      for(int i = 0; i < s.length(); ++i) {
         charsFreq[s.charAt(i) - 'a']++;
      }

      return dfs(engNumbers, 0, new ArrayDeque<>(), charsFreq, s.length());
   }

   private static String dfs(String[] engNumbers, int numberToFind, Deque<Integer> integers, int[] charsFreq, int charsLeft) {
      if (numberToFind == 10 || charsLeft == 0) {
         if (charsLeft > 0) {
            return "";
         }

         StringBuilder stringBuilder = new StringBuilder();

         for (int numb : integers) {
            stringBuilder.append(numb);
         }

         return stringBuilder.toString();
      }

      String engWord = engNumbers[numberToFind];
      int possibleTimes = charsLeft / engWord.length();

      int maxOccurrencesReached = 0;
      for(int occurrences = 0; occurrences <= possibleTimes; ++occurrences) {

         if (occurrences == 0 || tryDecrementFromChars(charsFreq, engWord)) {
            if (occurrences > 0) {
               maxOccurrencesReached++;
               charsLeft -= engWord.length();
               integers.addLast(numberToFind);
            }
            String foundValue = dfs(engNumbers, numberToFind + 1, integers, charsFreq, charsLeft);

            if (!foundValue.isEmpty()) {
               return foundValue;
            }
         } else {
            break;
         }

      }

      for(int i = 0; i < engWord.length(); ++i) {
         charsFreq[engWord.charAt(i) - 'a'] += maxOccurrencesReached;
      }

      for(int i = 0; i < maxOccurrencesReached; ++i) {
         integers.pollLast();
      }

      return "";

   }

   private static boolean tryDecrementFromChars(int[] charsFreq, String engWord) {
      for(int i = 0; i < engWord.length(); ++i) {
         if (--charsFreq[engWord.charAt(i) - 'a'] < 0) {
            for(int j = 0; j <= i; ++j) {
               charsFreq[engWord.charAt(j) - 'a']++;
            }
            return false;
         }
      }

      return true;
   }
}
