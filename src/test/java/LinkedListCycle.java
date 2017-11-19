import common.ListNode;

public class LinkedListCycle {
   public static boolean hasCycle(ListNode head) {

      ListNode dummy = new ListNode(-1);
      ListNode current = head;

      while (current != null) {
         if (current.next == dummy) {
            return true;
         }

         ListNode temp = current.next;
         current.next = dummy;
         current = temp;
      }

      return false;
   }
}
