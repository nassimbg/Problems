public class SwapNidesInPairs {


   public static ListNode swapPairs(ListNode head) {

      if (head.next == null) {
         return head;
      }

      ListNode newHead = head.next;
      head.next = newHead.next;
      newHead.next = head;
      ListNode parent = head;

      while (parent.next != null && parent.next.next != null) {
         ListNode child = parent.next;
         parent.next = child.next;
         child.next = child.next.next;
         parent.next.next = child;

         parent = child;
      }

      return newHead;

   }


   public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
   }
}






