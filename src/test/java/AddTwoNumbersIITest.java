import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.ListNode;

public class AddTwoNumbersIITest {

   @Test
   public void addTwoNumbers() {
      ListNode one = new ListNode(7);
      ListNode two = new ListNode(2);
      ListNode three = new ListNode(4);
      ListNode four = new ListNode(3);

      one.next = two;
      two.next = three;
      three.next = four;



      ListNode one2 = new ListNode(5);
      ListNode two2 = new ListNode(6);
      ListNode three2 = new ListNode(4);

      one2.next = two2;
      two2.next = three2;

      AddTwoNumbersII addTwoNumbersIITest = new AddTwoNumbersII();
      assertEquals("7 -> 8 -> 0 -> 7", addTwoNumbersIITest.addTwoNumbers(one, one2).toString());
   }


   @Test
   public void addTwoNumbers2() {
      ListNode four = new ListNode(5);

      ListNode three2 = new ListNode(5);


      AddTwoNumbersII addTwoNumbersIITest = new AddTwoNumbersII();
      assertEquals("1 -> 0", addTwoNumbersIITest.addTwoNumbers(four, three2).toString());
   }

}