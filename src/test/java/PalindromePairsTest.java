import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PalindromePairsTest {

   @Test
   public void palindromePairs() {
      List<List<Integer>> result = PalindromePairs.palindromePairs(new String[] { "bat", "tab", "cat" });

      assertEquals(Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1,0)), result);
   }

   @Test
   public void palindromePairs2() {
      List<List<Integer>> result = PalindromePairs.palindromePairs(new String[] { "abcd", "dcba", "lls", "s", "sssll" });

      assertEquals(Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1,0), Arrays.asList(3,2),  Arrays.asList(2,4)), result);
   }

}