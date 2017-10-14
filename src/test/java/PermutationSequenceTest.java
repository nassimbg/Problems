import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PermutationSequenceTest {
   @Test
   public void getPermutation1() throws Exception {
      assertEquals("3142", PermutationSequence.getPermutation(4, 14));
   }

   @Test
   public void getPermutation2() throws Exception {
      assertEquals("", PermutationSequence.getPermutation(2, 14));
   }

   @Test
   public void getPermutation3() throws Exception {
      assertEquals("1", PermutationSequence.getPermutation(1, 1));
   }

   @Test
   public void getPermutation4() throws Exception {
      assertEquals("1234", PermutationSequence.getPermutation(4, 1));
   }


}