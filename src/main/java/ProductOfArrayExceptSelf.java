public class ProductOfArrayExceptSelf {
   public static int[] productExceptSelf(int[] nums) {

      int[] product = new int[nums.length];

      int productValue = 1;
      for (int i = 0; i < nums.length; i++) {
         product[i] = productValue;
         productValue *= nums[i];
      }

      productValue = 1;
      for (int i = nums.length - 1; i >= 0; i--) {
         product[i] *= productValue;
         productValue *= nums[i];
      }

      return product;
   }
}
