public class PalindromeNumber {


   static boolean isPalindrome(int x) {
      int rev = 0;

      int current = x;
      while (current != 0) {
         rev=rev*10 + current%10;
         current/=10;
      }

      return rev==x;
   }
}
