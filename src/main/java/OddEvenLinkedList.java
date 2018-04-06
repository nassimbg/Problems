import common.ListNode;

public class OddEvenLinkedList {
   public static ListNode oddEvenList(ListNode head) {
      ListNode oddDummy = new ListNode(0);
      ListNode evenDummy = new ListNode(0);
      ListNode odd = oddDummy;
      ListNode even = evenDummy;
      ListNode current = head;

      boolean oddTurn = true;
      while (current != null) {

         if (oddTurn) {
            odd = odd.next = current;
         } else {
            even = even.next = current;
         }
         current = current.next;
         oddTurn = !oddTurn;
      }

      odd.next = evenDummy.next;
      even.next = null;

      return oddDummy.next;
   }
}
