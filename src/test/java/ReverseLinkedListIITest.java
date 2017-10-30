import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.ListNode;

public class ReverseLinkedListIITest {
   @Test
   public void reverseBetween() throws Exception {
      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);

      first.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;

      first = ReverseLinkedListII.reverseBetween(first, 2, 4);

      assertEquals("1 -> 4 -> 3 -> 2 -> 5", first.toString());
   }


   @Test
   public void reverseBetween2() throws Exception {
      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);

      first.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;

      first = ReverseLinkedListII.reverseBetween(first, 1, 3);

      assertEquals("3 -> 2 -> 1 -> 4 -> 5", first.toString());
   }


}