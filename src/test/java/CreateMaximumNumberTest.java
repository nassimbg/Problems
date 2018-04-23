import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CreateMaximumNumberTest {

   @Test
   public void maxNumber() {
      assertArrayEquals(new int[] { 9, 8, 6, 5, 3 }, CreateMaximumNumber.maxNumber(new int[] { 3, 4, 6, 5 }, new int[] { 9, 1, 2, 5, 8, 3 }, 5));
   }


   @Test
   public void maxNumber2() {
      assertArrayEquals(new int[] { 6, 7, 6, 0, 4 }, CreateMaximumNumber.maxNumber(new int[] {6, 7}, new int[] { 6, 0, 4 }, 5));
   }

   @Test
   public void maxNumber3() {
      assertArrayEquals(new int[] { 9, 8, 9 }, CreateMaximumNumber.maxNumber(new int[] {3, 9}, new int[] { 8, 9}, 3));
   }

}