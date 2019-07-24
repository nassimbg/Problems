import common.ListNode;

public class RemoveNthNodeFromEndofList {

   public static ListNode removeNthFromEndNonRecursive(ListNode head, int n) {
      ListNode dummyHead = new ListNode(-1);
      dummyHead.next = head;
      ListNode ahead = head;

      int count = 0;
      while (ahead != null && count < n) {
         count++;
         ahead = ahead.next;
      }


      ListNode current = dummyHead;

      while (ahead != null) {
         current = current.next;
         ahead = ahead.next;
      }

      if (current != null) {
         ListNode temp = current.next;

         if (temp != null) {
            current.next = temp.next;
            temp.next = null;
         }
      }

      return dummyHead.next;
   }

   public static ListNode removeNthFromEndRecursive(ListNode head, int n) {

      int indexOfHead = recursivePass(head, n);

      return indexOfHead == n ? head.next : head;

   }

   private static int recursivePass(ListNode head, int n) {
      if (head.next == null) {
         return 1;
      }

      int indexOfNext = recursivePass(head.next, n);

      if (indexOfNext == n) {
         head.next = head.next.next;
      }

      return indexOfNext + 1;
   }
}
