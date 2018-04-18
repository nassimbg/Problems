import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseVowelsOfStringTest {

   @Test
   public void reverseVowels() {
      assertEquals("holle", ReverseVowelsOfString.reverseVowels("hello"));
   }

   @Test
   public void reverseVowels2() {
      assertEquals("leotcede", ReverseVowelsOfString.reverseVowels("leetcode"));
   }


   @Test
   public void reverseVowels3() {
      assertEquals("", ReverseVowelsOfString.reverseVowels(""));
   }

   @Test
   public void reverseVowels4() {
      assertEquals("aoeiu", ReverseVowelsOfString.reverseVowels("uieoa"));
   }

   @Test
   public void reverseVowels5() {
      assertEquals("aA", ReverseVowelsOfString.reverseVowels("Aa"));
   }
}