import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.ListNode;

public class ReorderListTest {
   @Test
   public void reorderList() throws Exception {
      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);
      ListNode six = new ListNode(6);

      first.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;
      fifth.next = six;


      ReorderList.reorderList(first);

      assertEquals("1 -> 6 -> 2 -> 5 -> 3 -> 4", first.toString());
   }

   @Test
   public void reorderList2() throws Exception {
      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);
      ListNode six = new ListNode(6);
      ListNode seven = new ListNode(7);

      first.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;
      fifth.next = six;
      six.next = seven;


      ReorderList.reorderList(first);
      assertEquals("1 -> 7 -> 2 -> 6 -> 3 -> 5 -> 4", first.toString());

   }

   @Test
   public void reorderList3() throws Exception {
      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);

      first.next = second;


      ReorderList.reorderList(first);
      assertEquals("1 -> 2", first.toString());

   }

   @Test
   public void reorderList4() throws Exception {
      ListNode first = new ListNode(1);



      ReorderList.reorderList(first);
      assertEquals("1", first.toString());

   }
}