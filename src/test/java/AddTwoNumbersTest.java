import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by nboughannam on 6/10/2017.
 */
public class AddTwoNumbersTest {
   @Test
   public void addTwoNumbers() throws Exception {

      AddTwoNumbers.ListNode list1 = new AddTwoNumbers.ListNode(1);
      AddTwoNumbers.ListNode list2 = new AddTwoNumbers.ListNode(9);
      list2.next = new AddTwoNumbers.ListNode(9);
      AddTwoNumbers.ListNode listNode = new AddTwoNumbers().addTwoNumbers(list1, list2);

      AddTwoNumbers.ListNode expected = new AddTwoNumbers.ListNode(0);
      expected.next = new AddTwoNumbers.ListNode(0);
      expected.next.next = new AddTwoNumbers.ListNode(1);
      assertEqual(listNode, expected);
   }

   @Test
   public void addTwoNumbers1() throws Exception {

      AddTwoNumbers.ListNode list1 = new AddTwoNumbers.ListNode(5);
      AddTwoNumbers.ListNode list2 = new AddTwoNumbers.ListNode(5);
      AddTwoNumbers.ListNode listNode = new AddTwoNumbers().addTwoNumbers(list1, list2);

      AddTwoNumbers.ListNode expected = new AddTwoNumbers.ListNode(0);
      expected.next = new AddTwoNumbers.ListNode(1);
      assertEqual(listNode, expected);
   }

   private void assertEqual(AddTwoNumbers.ListNode listNode, AddTwoNumbers.ListNode expected) {
      while (listNode != null || expected != null) {
         assertEquals(expected.val, listNode.val);
         listNode = listNode.next;
         expected = expected.next;
      }
   }
}
