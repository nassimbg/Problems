import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ThreeSumTest {

   @Test
   public void test2() {
      int[] nums = new int[] {0,0};

      assertEquals(new ArrayList<>(),ThreeSum.threeSum(nums));
   }

   @Test
   public void test3() {
      int[] nums = new int[] {-1,0,1,0};

      assertEquals(Arrays.asList(Arrays.asList(-1, 0 ,1)),ThreeSum.threeSum(nums));
   }



}