import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import common.ListNode;

public class LinkedListCycleTest {
   @Test
   public void hasCycle() throws Exception {
      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);

      first.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;

      fifth.next = second;

      assertTrue(LinkedListCycle.hasCycle(fifth));
   }

   @Test
   public void hasCycle2() throws Exception {
      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);

      first.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;


      assertFalse(LinkedListCycle.hasCycle(fifth));
   }

   @Test
   public void hasCycle3() throws Exception {


      assertFalse(LinkedListCycle.hasCycle(null));
   }

}