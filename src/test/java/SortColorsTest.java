import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortColorsTest {
   @Test
   public void sortColors() throws Exception {
      int[] values = new int[]{1,2,0,2,2,1,0,0,2};

      SortColors.sortColors(values);

      assertArrayEquals(new int[]{0,0,0,1,1,2,2,2,2}, values);
   }

   @Test
   public void sortColors1() throws Exception {
      int[] values = new int[]{0,0};

      SortColors.sortColors(values);

      assertArrayEquals(new int[]{0,0}, values);
   }


   @Test
   public void sortColors2() throws Exception {
      int[] values = new int[]{0,1};

      SortColors.sortColors(values);

      assertArrayEquals(new int[]{0,1}, values);
   }

   @Test
   public void sortColors3() throws Exception {
      int[] values = new int[]{2};

      SortColors.sortColors(values);

      assertArrayEquals(new int[]{2}, values);
   }

   @Test
   public void sortColors4() throws Exception {
      int[] values = new int[]{1,0};

      SortColors.sortColors(values);

      assertArrayEquals(new int[]{0,1}, values);
   }


   @Test
   public void sortColors5() throws Exception {
      int[] values = new int[]{2,2,0,0,2,0,2,1,0};

      SortColors.sortColors(values);

      assertArrayEquals(new int[]{0,0,0,0,1,2,2,2,2}, values);
   }
}