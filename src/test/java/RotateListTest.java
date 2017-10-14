import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import common.ListNode;

public class RotateListTest {
   @Test
   public void rotateRight() throws Exception {
      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);

      first.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;

      ListNode listNode = RotateList.rotateRight(first, 2);

      assertEquals("4 -> 5 -> 1 -> 2 -> 3 -> null", listNode.toString());

   }

   @Test
   public void rotateRight2() throws Exception {
      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);

      first.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;

      ListNode listNode = RotateList.rotateRight(first, 8);

      assertEquals("3 -> 4 -> 5 -> 1 -> 2 -> null", listNode.toString());

   }

   @Test
   public void rotateRight3() throws Exception {
      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);

      first.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;

      ListNode listNode = RotateList.rotateRight(first, 0);

      assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> null", listNode.toString());

   }

   @Test
   public void rotateRight4() throws Exception {
      ListNode first = new ListNode(1);


      ListNode listNode = RotateList.rotateRight(first, 8);

      assertEquals("1 -> null", listNode.toString());

   }

   @Test
   public void rotateRight5() throws Exception {


      ListNode listNode = RotateList.rotateRight(null, 0);

      assertNull(listNode);

   }
}