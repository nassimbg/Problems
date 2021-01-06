import java.util.Arrays;

public class CheckIfAStringCanBreakAnotherString {

  public static boolean checkIfCanBreak(String s1, String s2) {

    if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) {
      return false;
    }

    String sortedS1 = sortString(s1);
    String sortedS2 = sortString(s2);


    // if 0 => no breaker, if 1 => s2 is breaker, if -1 => s1 is breaker
    int breaker = 0;

    final int length = sortedS1.length();

    for (int index = 0; index < length; index++) {
      final char currentCharS1 = sortedS1.charAt(index);
      final char currentCharS2 = sortedS2.charAt(index);

      if (currentCharS1 > currentCharS2) {

        if (breaker == 1) {
          return false;
        }
        breaker = -1;
      } else if (currentCharS1 < currentCharS2) {
        if (breaker == -1) {
          return false;
        }
        breaker = 1;
      }
    }
    return true;
  }

  private static String sortString(final String s1) {
    final char[] s1Chars = s1.toCharArray();
    Arrays.sort(s1Chars);
    return new String(s1Chars);
  }
}
