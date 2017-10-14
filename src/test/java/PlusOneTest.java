import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PlusOneTest {
   @Test
   public void plusOne() throws Exception {
      assertArrayEquals(new int[]{1}, PlusOne.plusOne(new int[]{0}));
   }

   @Test
   public void plusOne2() throws Exception {
      assertArrayEquals(new int[]{1,0}, PlusOne.plusOne(new int[]{9}));
   }

   @Test
   public void plusOne3() throws Exception {
      assertArrayEquals(new int[]{1,2,3,4,6}, PlusOne.plusOne(new int[]{1,2,3,4,5}));
   }

   @Test
   public void plusOne4() throws Exception {
      assertArrayEquals(new int[]{1,2,3,5,0}, PlusOne.plusOne(new int[]{1,2,3,4,9}));
   }

   @Test
   public void plusOne5() throws Exception {
      assertArrayEquals(new int[]{1,0,0}, PlusOne.plusOne(new int[]{9,9}));
   }

}