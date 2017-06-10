public class AddTwoNumbers {

   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode head = new ListNode(-1);
      ListNode current = head;
      boolean needsCarry = false;

      while(l1 !=null || l2!=null || needsCarry) {
         int summation = needsCarry ? 1 : 0;

         if(l1 != null) {
            summation += l1.val;
            l1 = l1.next;
         }

         if(l2 !=null) {
            summation += l2.val;
            l2 = l2.next;
         }

         current.next = new ListNode(summation % 10);
         current = current.next;
         needsCarry = summation >= 10;
      }

      return head.next;

   }

   static class ListNode {
      int val;
      ListNode next;

      ListNode(int x) {
         val = x;
      }
   }
}
