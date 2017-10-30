import common.ListNode;

public class ReverseLinkedListII {
   public static ListNode reverseBetween(ListNode head, int m, int n) {
      ListNode dummyHead = new ListNode(0);
      dummyHead.next = head;
      int counter = 0;

      ListNode start = dummyHead;
      while(counter + 1!= m ) {
         start = start.next;
         ++counter;
      }

      ListNode newLast = start.next;
      ++counter;

      while (counter < n) {
         ListNode iterator = newLast.next;
         newLast.next = iterator.next;

         iterator.next = start.next;
         start.next = iterator;
         ++counter;
      }

      return dummyHead.next;
   }

}
