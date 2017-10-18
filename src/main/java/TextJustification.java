import java.util.ArrayList;
import java.util.List;

public class TextJustification {

   public static List<String> fullJustify(String[] words, int maxWidth) {
      double[] dp = initializeDP(words);
      int[] dpIndex = new int[words.length + 1];

      calculateMinBadness(words, maxWidth, dp, dpIndex);

      return generateStrings(words, maxWidth, dp, dpIndex);

   }

   private static double[] initializeDP(String[] words) {
      double[] dp = new double[words.length + 1];
      for (int i = 0; i < words.length; i++) {
         dp[i] = Integer.MAX_VALUE;
      }
      dp[words.length] = 0;
      return dp;
   }

   private static void calculateMinBadness(String[] words, int maxWidth, double[] dp, int[] dpIndex) {
      for(int i = words.length - 1; i >=0; --i) {
         for(int j = i + 1; j <dp.length; ++j) {
            double badness = badness(words, maxWidth, i, j) + dp[j];
            if (badness <= dp[i]) {
               dp[i] = badness;
               dpIndex[i] = j;
            }
         }
      }
   }

   private static double badness(String[] words, int maxWidth, int i , int j) {
      int width = words[i].length();
      for (int k = i + 1; k < j; k++) {
         width += (1 + words[k].length());
      }

      return maxWidth < width ? Integer.MAX_VALUE : maxWidth - width;
   }


   private static List<String> generateStrings(String[] words, int maxWidth, double[] dp, int[] dpIndex) {
      List<String> results = new ArrayList<>();
      int counter = 0;
      while (counter < words.length) {
         int nextLineStartingIndex = dpIndex[counter];

         StringBuilder stringBuilder = new StringBuilder();
         String word = words[counter];
         stringBuilder.append(word);

         if(nextLineStartingIndex == counter + 1) {
            addWhiteSpaces(maxWidth - word.length(), stringBuilder);
         } else if (nextLineStartingIndex != dp.length - 1) {
            int numberOfWordsOnCurrentLine = nextLineStartingIndex - counter;
            double remainingWhiteSpace = (dp[counter] - dp[nextLineStartingIndex] + (numberOfWordsOnCurrentLine - 1));

            for (int i = counter + 1; i < nextLineStartingIndex; i++) {
               int taken = (int) Math.ceil(remainingWhiteSpace / (nextLineStartingIndex - i));
               addWhiteSpaces(taken, stringBuilder);
               stringBuilder.append(words[i]);
               remainingWhiteSpace -= taken;
            }
         } else {
            int width = word.length();
            for (int i = counter + 1; i < nextLineStartingIndex; i++) {
               addWhiteSpaces(1, stringBuilder);
               stringBuilder.append(words[i]);
               width += (1 + words[i].length());
            }

            addWhiteSpaces(maxWidth - width, stringBuilder);
         }

         counter = nextLineStartingIndex;
         results.add(stringBuilder.toString());
      }
      return results;
   }
   private static void addWhiteSpaces(int maxValue, StringBuilder stringBuilder) {
      for (int space = 0; space < maxValue; space++) {
         stringBuilder.append(' ');
      }
   }

}
