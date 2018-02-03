public class MaximumProductSubarray {

   /**
    * this is a O(n) algo by calculating the current Min and Max values that contain the current value
    * and then checking if the global max < maxProduct
    * @param nums
    * @return
    */
   public static int maxProduct(int[] nums) {
      int maxProduct = nums[nums.length - 1];
      int minProduct = nums[nums.length - 1];
      int globalMax = maxProduct;
      for (int index = nums.length - 2; index >= 0; index--) {

         int productOfMin = minProduct * nums[index];
         int productOfMax = nums[index] * maxProduct;
         minProduct = Math.min(nums[index],  Math.min(productOfMax, productOfMin));
         maxProduct = Math.max(nums[index], Math.max(productOfMax, productOfMin));

         if (globalMax < maxProduct) {
            globalMax = maxProduct;
         }

      }

      return globalMax;
   }
   /**
    * this is a Divide and Conquer algo its a bit different from that of Max Sum Subarray by also keeping track of min on Left and min on Right to multiply them by each other
    * and check if their product is the max
    * @param nums
    * @return
    */
   public static int maxProductDivideAndConquer(int[] nums) {
      return maxProductRec(nums, 0, nums.length - 1);
   }

   private static int maxProductRec(int[] nums, int start, int end) {
      if (start <= end) {
         int mid = (start + end)/2;

         int maxProduct = Math.max(maxProductRec(nums, start, mid-1), maxProductRec(nums, mid + 1, end));

         int localProduct = 1;
         int maxLeft = Integer.MIN_VALUE;
         int minLeft = Integer.MAX_VALUE;
         for(int index = mid; index>=start; --index) {
            localProduct *= nums[index];

            if (maxLeft < localProduct) {
               maxLeft = localProduct;
            }

            if (minLeft > localProduct) {
               minLeft = localProduct;
            }
         }

         localProduct = 1;
         int maxRight = Integer.MIN_VALUE;
         int minRight = Integer.MAX_VALUE;
         for(int index = mid + 1; index <=end; ++index) {
            localProduct *= nums[index];

            if (maxRight < localProduct) {
               maxRight = localProduct;
            }

            if (minRight > localProduct) {
               minRight = localProduct;
            }
         }


         if (mid >= start && maxProduct < maxLeft) {
            maxProduct = maxLeft;

         }

         if (mid +1 <= end && maxProduct < maxRight) {
            maxProduct = maxRight;
         }

         if(mid>= start && mid<end) {
            maxProduct = Math.max(Math.max(maxRight * maxLeft, minLeft*minRight), maxProduct);
         }



         return maxProduct;
      }
      return Integer.MIN_VALUE;
   }
}
