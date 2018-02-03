import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromePermutationTest {

   @Test
   public void canPermutePalindrome() {
      assertTrue(PalindromePermutation.canPermutePalindrome("aab"));
   }

   @Test
   public void canPermutePalindrome1() {
      assertFalse(PalindromePermutation.canPermutePalindrome("code"));
   }
}