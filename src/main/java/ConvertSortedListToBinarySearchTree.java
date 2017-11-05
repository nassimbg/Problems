import common.ListNode;
import common.TreeNode;

public class ConvertSortedListToBinarySearchTree {

   ListNode dummy;
   public TreeNode sortedListToBST(ListNode head) {

      int count = 0;
      ListNode current = head;
      while (current!= null) {
         ++count;
         current = current.next;
      }
      --count;

      dummy = head;
      return buildRec(0, count);
   }

   TreeNode buildRec(int start, int end) {
      if (end >= start) {
         int mid = (start + end)/2;

         TreeNode left = buildRec(start, mid - 1);

         TreeNode root = new TreeNode(dummy.val);
         dummy = dummy.next;

         TreeNode right = buildRec(mid + 1, end);

         root.left = left;
         root.right = right;

         return root;
      }

      return null;
   }
}
