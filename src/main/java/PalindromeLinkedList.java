import common.ListNode;

public class PalindromeLinkedList {

   public static boolean isPalindrome(ListNode head) {

      int length = 0;

      ListNode current = head;
      while(current != null) {
         current = current.next;
         ++length;
      }

      int counter = 0;
      ListNode nextHalf = head;
      while (counter < length/2 - 1) {
         nextHalf = nextHalf.next;
         ++counter;
      }

      if (length % 2 != 0) {
         nextHalf = nextHalf.next;
      }

      ListNode dummyHead = new ListNode(0);

      while (nextHalf.next != null) {
         ListNode temp = nextHalf.next;
         nextHalf.next = nextHalf.next.next;
         temp.next = dummyHead.next;
         dummyHead.next = temp;
      }


      current = head;
      nextHalf = dummyHead.next;
      while (nextHalf != null) {
         if (current.val != nextHalf.val) {
            return false;
         }
         current = current.next;
         nextHalf = nextHalf.next;
      }
      return true;

   }
}
