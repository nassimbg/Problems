import common.ListNode;

public class LinkedListCycle {


   public static boolean hasCycle(ListNode head) {

      ListNode slow = head;
      ListNode fast = head;

      while (slow != null && fast != null) {

         slow = slow.next;
         fast = fast.next;
         if (fast != null) {
            fast = fast.next;
         }

         if (slow == fast) {
            return true;
         }
      }

      return false;
   }
   public static boolean hasCycle1(ListNode head) {

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
