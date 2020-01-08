import java.util.Arrays;

public class ArrayPartitionI {
   public int arrayPairSum(int[] nums) {
      Arrays.sort(nums);

      int val = 0;
      for(int i=0; i < nums.length; i+=2) {
         val += nums[i];
      }

      return val;
   }
}
