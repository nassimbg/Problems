public class RangeSumQueryMutable {

   private final int[] fenwickTree;
   private final int[] original;
   public RangeSumQueryMutable(int[] nums) {

      fenwickTree = new int[nums.length + 1];

      for (int i = 1; i < fenwickTree.length; i++) {
         updatedValues(nums[i - 1], i);
      }

      original = nums;
   }

   private void updatedValues(int updatedValue, int currentIndex) {
      while(currentIndex < fenwickTree.length) {
         fenwickTree[currentIndex] += updatedValue;
         currentIndex = getNextUpdateIndex(currentIndex);
      }
   }

   private static int getNextUpdateIndex(int i) {
      return i + (i & -i);
   }

   private static int getNextReadIndex(int i) {
      return i - (i & -i);
   }

   public void update(int i, int val) {
      int oldValue = original[i];
      original[i] = val;
      updatedValues(val - oldValue, i + 1);
   }

   public int sumRange(int i, int j) {
      return getSum(j) - getSum(i - 1);

   }

   private int getSum(int i) {
      int currentIndex = i + 1;
      int sum = 0;
      while (currentIndex > 0) {
         sum += fenwickTree[currentIndex];
         currentIndex = getNextReadIndex(currentIndex);
      }

      return sum;
   }
}
