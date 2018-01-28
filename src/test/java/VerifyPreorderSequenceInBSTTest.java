import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VerifyPreorderSequenceInBSTTest {

   @Test
   public void verifyPreorder() {
      assertTrue(VerifyPreorderSequenceInBST.verifyPreorder(new int[] { 5, 3, 1, 2, 4, 8, 6, 7, 10, 9 }));
   }

   @Test
   public void verifyPreorder2() {
      assertTrue(VerifyPreorderSequenceInBST.verifyPreorder(new int[] { 8, 3, 1, 2, 4, 5, 6, 7, 10, 9 }));
   }


   @Test
   public void verifyPreorder3() {
      assertFalse(VerifyPreorderSequenceInBST.verifyPreorder(new int[] { 5, 9, 1, 2, 4, 8, 6, 7, 10, 3 }));
   }
}