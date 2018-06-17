import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import common.ListNode;

public class LinkedListRandomNode {
   class Solution {

      List<ListNode> list;
      Random random;

      /** @param head The linked list's head.
      Note that the head is guaranteed to be not null, so it contains at least one node. */
      public Solution(ListNode head) {
         list = new ArrayList<>();

         ListNode current = head;

         while (current != null) {
            list.add(current);
            current = current.next;
         }
         random = new Random();
      }

      /** Returns a random node's value. */
      public int getRandom() {
         return list.get(random.nextInt(list.size())).val;
      }
   }
}
