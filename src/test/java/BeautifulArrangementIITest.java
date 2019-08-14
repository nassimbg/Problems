import static org.junit.Assert.*;

import org.junit.Test;

public class BeautifulArrangementIITest {

   @Test
   public void constructArray() {
      assertArrayEquals(new int[] {1,2,3}, BeautifulArrangementII.constructArray(3, 1));
   }

   @Test
   public void constructArray2() {
      assertArrayEquals(new int[] {1,3,2}, BeautifulArrangementII.constructArray(3, 2));
   }

   @Test
   public void constructArray3() {
      assertArrayEquals(new int[] {1,5,2,4,3}, BeautifulArrangementII.constructArray(5, 4));
   }

   @Test
   public void constructArray4() {
      assertArrayEquals(new int[] {1,5,4,3, 2}, BeautifulArrangementII.constructArray(5, 2));
   }
}