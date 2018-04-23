public class CreateMaximumNumber {
   public static int[] maxNumber(int[] nums1, int[] nums2, int k) {

      int[] result = new int[k];

      for (int lengthOfFirst = 0; lengthOfFirst <= k; lengthOfFirst++) {
         int lengthOfSecond = k - lengthOfFirst;

         int[] firstArray = maxInArray(nums1, lengthOfFirst);
         int[] secondArray = maxInArray(nums2, lengthOfSecond);
         int[] merged = merge(firstArray, secondArray);

         if (merged.length == k) {
            result = chooseBest(result, merged);
         }
      }
      return result;
   }

   private static int[] chooseBest(int[] best, int[] current) {
      for (int index = 0; index < best.length; index++) {
         if (best[index] > current[index]) {
            return best;
         } else if (best[index] < current[index]) {
            return current;
         }
      }

      return current;
   }

   private static int[] merge(int[] firstArray, int[] secondArray) {
      int[] result = new int[firstArray.length + secondArray.length];

      int indexFirst = 0;
      int indexSecond = 0;

      int size = 0;
      while (indexFirst < firstArray.length && indexSecond < secondArray.length) {

         result[size++] = greater(firstArray, indexFirst, secondArray, indexSecond) ? firstArray[indexFirst++]: secondArray[indexSecond++];
      }

      while (indexFirst < firstArray.length) {
         result[size++] = firstArray[indexFirst++];
      }

      while (indexSecond < secondArray.length) {
         result[size++] = secondArray[indexSecond++];
      }

      return result;
   }

   public static boolean greater(int[] nums1, int i, int[] nums2, int j) {
      while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
         i++;
         j++;
      }
      return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]);
   }

   private static int[] maxInArray(int[] nums, int k) {

      if (nums.length < k) {
         return new int[0];
      }
      int[] result = new int[k];

      int size = 0;
      for (int index = 0; index < nums.length; index++) {
         while (size > 0 && nums.length - index > k - size && result[size - 1] < nums[index]) {
            --size;
         }

         if (size < k) {
            result[size++] = nums[index];
         }
      }

      return result;
   }
}
