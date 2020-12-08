
public class NumberOfMatchingSubsequences {
  public static int numMatchingSubseq(String S, String[] words) {
    int count = 0;
    for (final String word : words) {

      int mainIndex = 0;
      int secondIndex = 0;

      while (mainIndex < S.length() && secondIndex < word.length()) {
        if (S.charAt(mainIndex) == word.charAt(secondIndex)) {
          mainIndex++;
          secondIndex++;
        } else {
          mainIndex++;
        }
      }

      if (secondIndex == word.length()) {
        count++;
      }

    }

    return count;
  }

}
