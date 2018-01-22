import static org.junit.Assert.assertTrue;

import org.junit.Test;

import common.ListNode;

public class PalindromeLinkedListTest {
   @Test
   public void isPalindrome() throws Exception {
      ListNode one = new ListNode(1);
      ListNode two = new ListNode(2);
      ListNode three =  new ListNode(2);
      ListNode four = new ListNode(1);

      one.next = two;
      two.next = three;
      three.next = four;

      assertTrue(PalindromeLinkedList.isPalindrome(one));

   }

   @Test
   public void isPalindrome2() throws Exception {
      ListNode one = new ListNode(1);
      ListNode two = new ListNode(2);
      ListNode twoPrime = new ListNode(3);
      ListNode three =  new ListNode(2);
      ListNode four = new ListNode(1);

      one.next = two;
      two.next = twoPrime;
      twoPrime.next = three;
      three.next = four;

      assertTrue(PalindromeLinkedList.isPalindrome(one));

   }

}