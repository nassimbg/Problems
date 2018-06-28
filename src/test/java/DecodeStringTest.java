import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecodeStringTest {

   @Test
   public void decodeString() {
      DecodeString decodeString = new DecodeString();

      assertEquals("aaabcbc", decodeString.decodeString("3[a]2[bc]"));
   }


   @Test
   public void decodeString2() {
      DecodeString decodeString = new DecodeString();

      assertEquals("accaccacc", decodeString.decodeString("3[a2[c]]"));
   }

   @Test
   public void decodeString3() {
      DecodeString decodeString = new DecodeString();

      assertEquals("abcabccdcdcdef", decodeString.decodeString("2[abc]3[cd]ef"));
   }

   @Test
   public void decodeString4() {
      DecodeString decodeString = new DecodeString();

      assertEquals("aa", decodeString.decodeString("aa3[]"));
   }
}