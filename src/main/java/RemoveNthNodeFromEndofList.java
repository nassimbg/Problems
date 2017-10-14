import common.ListNode;

public class RemoveNthNodeFromEndofList {


   public static ListNode removeNthFromEnd(ListNode head, int n) {

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
