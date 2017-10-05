import org.junit.Test;

public class MergeTwoSortedListsTest {
   @Test
   public void mergeTwoLists() throws Exception {

      MergeTwoSortedLists.ListNode first = new MergeTwoSortedLists.ListNode(1);
      MergeTwoSortedLists.ListNode three = new MergeTwoSortedLists.ListNode(3);
      MergeTwoSortedLists.ListNode five = new MergeTwoSortedLists.ListNode(5);
      MergeTwoSortedLists.ListNode seven = new MergeTwoSortedLists.ListNode(7);

      first.next = three;
      three.next = five;
      five.next = seven;

      MergeTwoSortedLists.ListNode two = new MergeTwoSortedLists.ListNode(2);
      MergeTwoSortedLists.ListNode four = new MergeTwoSortedLists.ListNode(4);
      MergeTwoSortedLists.ListNode six = new MergeTwoSortedLists.ListNode(6);
      MergeTwoSortedLists.ListNode eight = new MergeTwoSortedLists.ListNode(8);

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