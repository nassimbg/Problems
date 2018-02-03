import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PalindromePermutationIITest {

   @Test
   public void generatePalindromes() {
      assertEquals(Arrays.asList("abba", "baab"), PalindromePermutationII.generatePalindromes("aabb"));
   }

   @Test
   public void generatePalindromes2() {
      assertEquals(Arrays.asList("abcba", "bacab"), PalindromePermutationII.generatePalindromes("caabb"));
   }

   @Test
   public void generatePalindromes1() {
      assertEquals(Arrays.asList(), PalindromePermutationII.generatePalindromes("abc"));
   }
}