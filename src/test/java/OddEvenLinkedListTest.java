import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.ListNode;

public class OddEvenLinkedListTest {

   @Test
   public void oddEvenList() {
      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);

      first.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;

      ListNode listNode = OddEvenLinkedList.oddEvenList(first);
      assertEquals("1 -> 3 -> 5 -> 2 -> 4", listNode.toString());
   }
}