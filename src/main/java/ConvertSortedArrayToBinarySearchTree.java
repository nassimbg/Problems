import common.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
   public TreeNode sortedArrayToBST(int[] nums) {
      return build(nums, 0, nums.length - 1);
   }

   private TreeNode build(int[] nums, int start, int end) {
     if (end >= start) {
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = build(nums, start, mid - 1);
        root.right = build(nums, mid + 1, end);
        return root;
     }
     return null;
   }
}
