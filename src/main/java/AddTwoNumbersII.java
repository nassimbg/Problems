import common.ListNode;

public class AddTwoNumbersII {

   private boolean carry = false;
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


      int sizeOne = findLengthOfList(l1);
      int sizeTwo = findLengthOfList(l2);


      ListNode largerList = l1;
      ListNode smallerList = l2;
      if (sizeOne < sizeTwo) {
         largerList = l2;
         smallerList = l1;
      }

      int diff = Math.abs(sizeOne - sizeTwo);

      ListNode sameLevelAddition = addLists(largerList, smallerList, 1, diff);




      ListNode head = new ListNode(0);
      head.next = sameLevelAddition;

      if (carry) {
         ListNode carry = new ListNode(1);
         carry.next = head.next;
         head.next = carry;
      }

      return head.next;

   }

   private ListNode addLists(ListNode l1, ListNode l2, int index, int diff) {
      if (l1 != null) {
         ListNode nextInL1 = l1.next;
         ListNode nextInL2 = l2;
         int val = l1.val;

         if (index > diff) {
            val +=l2.val;
            nextInL2 = l2.next;
         }
         ListNode next = addLists(nextInL1, nextInL2, index + 1, diff);

         if (carry) {
            ++val;
         }

         if (val > 9) {
            carry = true;
            val %= 10;
         } else {
            carry = false;
         }
         ListNode listNode = new ListNode(val);
         listNode.next = next;

         return listNode;
      }
      return null;
   }

   private static int findLengthOfList(ListNode head) {

      ListNode current = head;
      int size = 0;

      while (current != null) {
         ++size;
         current = current.next;
      }

      return size;
   }
}
