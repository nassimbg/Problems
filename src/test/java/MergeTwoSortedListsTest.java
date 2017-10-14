import org.junit.Test;

import common.ListNode;

public class MergeTwoSortedListsTest {
   @Test
   public void mergeTwoLists() throws Exception {

      ListNode first = new ListNode(1);
      ListNode three = new ListNode(3);
      ListNode five = new ListNode(5);
      ListNode seven = new ListNode(7);

      first.next = three;
      three.next = five;
      five.next = seven;

      ListNode two = new ListNode(2);
      ListNode four = new ListNode(4);
      ListNode six = new ListNode(6);
      ListNode eight = new ListNode(8);

      two.next = four;
      four.next = six;
      six.next = eight;


      first = MergeTwoSortedLists.mergeTwoLists(first, two);

      while (first != null) {
         System.out.print(first.val);
         first = first.next;
      }
   }

}