import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindKPairsWithSmallestSumsTest {

   @Test
   public void kSmallestPairs() {
      int[] nums1 = new int[]{1,7,11};
      int[] nums2 = new int[]{2,4,6};

      List<int[]> expected = Arrays.asList(new int[] { 1, 2 }, new int[] { 1, 4 }, new int[] { 1, 6 });

      List<int[]> actual = FindKPairsWithSmallestSums.kSmallestPairs(nums1, nums2, 3);

      assertEquals(expected.size(), actual.size());

      for(int index = 0; index < expected.size(); ++index) {
         assertArrayEquals(expected.get(index), actual.get(index));
      }
   }

   @Test
   public void kSmallestPairs2() {
      int[] nums1 = new int[]{1,1,2};
      int[] nums2 = new int[]{1,2,3};

      List<int[]> expected = Arrays.asList(new int[] { 1, 1 }, new int[] { 1, 1 });

      List<int[]> actual = FindKPairsWithSmallestSums.kSmallestPairs(nums1, nums2, 2);

      assertEquals(expected.size(), actual.size());

      for(int index = 0; index < expected.size(); ++index) {
         assertArrayEquals(expected.get(index), actual.get(index));
      }
   }

   @Test
   public void kSmallestPairs3() {
      int[] nums1 = new int[]{1,2};
      int[] nums2 = new int[]{3};

      List<int[]> expected = Arrays.asList(new int[] { 1, 3 }, new int[] { 2, 3 });

      List<int[]> actual = FindKPairsWithSmallestSums.kSmallestPairs(nums1, nums2, 3);

      assertEquals(expected.size(), actual.size());

      for(int index = 0; index < expected.size(); ++index) {
         assertArrayEquals(expected.get(index), actual.get(index));
      }
   }
}