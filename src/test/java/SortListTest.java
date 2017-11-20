import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.ListNode;

public class SortListTest {
   @Test
   public void sortList() throws Exception {
      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);
      ListNode six = new ListNode(6);
      ListNode seven = new ListNode(7);

      six.next = third;
      third.next = second;
      second.next = fifth;
      fifth.next = first;
      first.next = seven;
      seven.next = fourth;

      assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7", SortList.sortList(six).toString());
   }


   @Test
   public void sortList1() throws Exception {
      ListNode first = new ListNode(1);

      assertEquals("1", SortList.sortList(first).toString());
   }

   @Test
   public void sortList2() throws Exception {

      assertEquals(null, SortList.sortList(null));
   }
}