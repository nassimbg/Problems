import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonPrefixTest {
   @Test
   public void longestCommonPrefix() throws Exception {

      String[] strs = new String[]{"nassim","nassam", "nasfalt"};

      assertEquals("nas", LongestCommonPrefix.longestCommonPrefix(strs));
   }
}