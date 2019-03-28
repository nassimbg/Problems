import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindAllAnagramsInAStringTest {

   @Test
   public void findAnagrams() {
      List<Integer> anagrams = FindAllAnagramsInAString.findAnagrams("cbaebabacd", "abc");

      assertEquals(Arrays.asList(0, 6), anagrams);
   }
}