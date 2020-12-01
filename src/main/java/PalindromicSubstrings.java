public class PalindromicSubstrings {
  public static int countSubstrings(String s) {

    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      count += numberOfPalindorms(s, i) + 1;
    }
    return count;
  }

  private static int numberOfPalindorms(String s, int index) {
    return numberOfPalindorms(s, index - 1, index) //palindrom with even length
        + numberOfPalindorms(s, index - 1, index + 1);//palindrom with odd length => center is current index
  }

  private static int numberOfPalindorms(final String s, int left, int right) {
    int count = 0;
    while (left >=0 && right < s.length() && s.charAt(left--) == s.charAt(right++)) {
      count++;
    }
    return count;
  }
}
