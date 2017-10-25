import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import common.ListNode;

public class PartitionListTest {
   @Test
   public void partition() throws Exception {
      ListNode one = new ListNode(1);
      ListNode two = new ListNode(4);
      ListNode three = new ListNode(3);
      ListNode four = new ListNode(2);
      ListNode five = new ListNode(5);
      ListNode six = new ListNode(2);

      one.next = two;
      two.next = three;
      three.next = four;
      four.next = five;
      five.next = six;

      one = PartitionList.partition(one, 3);

      assertNotNull(one);
      assertEquals("1 -> 2 -> 2 -> 4 -> 3 -> 5", one.toString());
   }


   @Test
   public void partition1() throws Exception {

      ListNode one = PartitionList.partition(null, 3);

      assertNull(one);
   }

   @Test
   public void partition2() throws Exception {

      ListNode head = new ListNode(4);
      head = PartitionList.partition(head, 3);

      assertNotNull(head);
      assertEquals("4", head.toString());
   }


}