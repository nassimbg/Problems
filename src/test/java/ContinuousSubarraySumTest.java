import static org.junit.Assert.*;

import org.junit.Test;

public class ContinuousSubarraySumTest {

   @Test
   public void checkSubarraySum() {
      assertTrue(ContinuousSubarraySum.checkSubarraySum(new int[] {23, 2, 4, 6, 7}, 6));
   }


   @Test
   public void checkSubarraySum1() {
      assertTrue(ContinuousSubarraySum.checkSubarraySum(new int[] {23, 2, 6, 4, 7}, 6));
   }

   @Test
   public void checkSubarraySum2() {
      assertTrue(ContinuousSubarraySum.checkSubarraySum(new int[] {23, 2, 4, 6, 7}, -6));
   }


   @Test
   public void checkSubarraySum3() {
      assertFalse(ContinuousSubarraySum.checkSubarraySum(new int[] {23, 2, 4, 6, 7}, 0));
   }


   @Test
   public void checkSubarraySum4() {
      assertTrue(ContinuousSubarraySum.checkSubarraySum(new int[] {0, 0}, 0));
   }



   @Test
   public void checkSubarraySum5() {
      assertFalse(ContinuousSubarraySum.checkSubarraySum(new int[] {0, 1, 0}, 0));
   }



   @Test
   public void checkSubarraySum6() {
      assertTrue(ContinuousSubarraySum.checkSubarraySum(new int[] {1,1}, -1));
   }

   @Test
   public void checkSubarraySum7() {
      assertTrue(ContinuousSubarraySum.checkSubarraySum(new int[] {5,0,0}, 0));
   }
}