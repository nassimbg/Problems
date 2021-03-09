public class ValidPalindromeII {

  public boolean validPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    return valid(s, left, right, false);
  }

  public boolean valid(String s, int left, int right, boolean deleted) {
    while (left < right) {
      char leftC = s.charAt(left);
      char rightC = s.charAt(right);

      if (leftC == rightC) {
        left++;
        right--;
      } else {
        if (deleted) {
          return false;
        }

        return valid(s, left, right - 1, true) ||
        valid(s, left + 1, right, true);
      }
    }

    return true;
  }
}
