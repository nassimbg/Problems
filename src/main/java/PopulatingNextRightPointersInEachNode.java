import common.TreeLinkNode;

/**
 * check @see <a href="https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/">Picture</a> to understand the question
 * visually at first and then read the documentation
 */
public class PopulatingNextRightPointersInEachNode {
   public void connect(TreeLinkNode root) {
      TreeLinkNode parent = root;

      // we apply the algo level by level starting from the first level (which contains the children of the root)
      // and down to the leaf level
      while (parent != null && parent.left != null) {

         // This algo traverses from left to right as below explained => the first node for every level is the left most node in this level
         // => so the first current node is "first" node
         // Moreover, first will be the new parent of the next level => save it
         TreeLinkNode first = parent.left;
         TreeLinkNode current = first;

         while (current != null) {
            // if current is the left child of the parent => The right child of the parent is the next node for current
            if (current == parent.left) {
               current.next = parent.right;
            }
            // else current is the right child => Its next node is its cousin => the new parent is the sibling of the old parent
            // and the next node of current is the left child of the new parent
            else {
               parent = parent.next;
               if (parent != null) {
                  current.next = parent.left;
               }
            }
            current = current.next;
         }

         parent = first;
      }
   }
}
