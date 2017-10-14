import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.ListNode;

/**
 * Created by nboughannam on 6/10/2017.
 */
public class AddTwoNumbersTest {
   @Test
   public void addTwoNumbers() throws Exception {

      ListNode list1 = new ListNode(1);
      ListNode list2 = new ListNode(9);
      list2.next = new ListNode(9);
      ListNode listNode = new AddTwoNumbers().addTwoNumbers(list1, list2);

      ListNode expected = new ListNode(0);
      expected.next = new ListNode(0);
      expected.next.next = new ListNode(1);
      assertEqual(listNode, expected);
   }

   @Test
   public void addTwoNumbers1() throws Exception {

      ListNode list1 = new ListNode(5);
      ListNode list2 = new ListNode(5);
      ListNode listNode = new AddTwoNumbers().addTwoNumbers(list1, list2);

      ListNode expected = new ListNode(0);
      expected.next = new ListNode(1);
      assertEqual(listNode, expected);
   }

   private void assertEqual(ListNode listNode, ListNode expected) {
      while (listNode != null || expected != null) {
         assertEquals(expected.val, listNode.val);
         listNode = listNode.next;
         expected = expected.next;
      }
   }
}
