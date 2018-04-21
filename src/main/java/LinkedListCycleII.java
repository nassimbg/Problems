import common.ListNode;

public class LinkedListCycleII {
   public ListNode detectCycle(ListNode head) {

      if (head == null) {
         return null;
      }

      ListNode fast = head;
      ListNode slow = head;

      boolean foundCycle = false;
      while (fast.next != null && fast.next.next != null) {
         slow = slow.next;
         fast = fast.next.next;

         if (slow == fast) {
            foundCycle = true;
            break;
         }
      }

      if (!foundCycle) {
         return null;
      }

      fast = slow;
      slow = head;

      while (fast != slow) {
         fast = fast.next;
         slow = slow.next;
      }

      return fast;
   }
}
