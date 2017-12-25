import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class RepeatedDNASequencesTest {
   @Test
   public void findRepeatedDnaSequences() throws Exception {
      assertEquals(Arrays.asList("AAAAACCCCC", "CCCCCAAAAA"), RepeatedDNASequences.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
   }

   @Test
   public void findRepeatedDnaSequences2() throws Exception {
      assertEquals(Arrays.asList("AAAAACCCCC", "CCCCCAAAAA"), RepeatedDNASequences.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTT"));
   }


}