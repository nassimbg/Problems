import static org.junit.Assert.assertEquals;

import org.junit.Test;

import common.ListNode;

public class ReverseNodesInKGroupTest {
   @Test
   public void reverseKGroup1() throws Exception {

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

      first = ReverseNodesInKGroup.reverseKGroup(first, 3);

      StringBuilder stringBuilder = new StringBuilder();
      while (first != null) {
         stringBuilder.append(first.val);
         first = first.next;
      }

      assertEquals("321654", stringBuilder.toString());
   }


   @Test
   public void reverseKGroup2() throws Exception {

      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);

      first.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;

      first = ReverseNodesInKGroup.reverseKGroup(first, 3);

      StringBuilder stringBuilder = new StringBuilder();
      while (first != null) {
         stringBuilder.append(first.val);
         first = first.next;
      }

      assertEquals("32145", stringBuilder.toString());
   }

   @Test
   public void reverseKGroup3() throws Exception {

      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);

      first.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;

      first = ReverseNodesInKGroup.reverseKGroup(first, 2);

      StringBuilder stringBuilder = new StringBuilder();
      while (first != null) {
         stringBuilder.append(first.val);
         first = first.next;
      }

      assertEquals("21435", stringBuilder.toString());
   }

   @Test
   public void reverseKGroup4() throws Exception {

      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);
      ListNode fifth = new ListNode(5);

      first.next = second;
      second.next = third;
      third.next = fourth;
      fourth.next = fifth;

      first = ReverseNodesInKGroup.reverseKGroup(first, 1);

      StringBuilder stringBuilder = new StringBuilder();
      while (first != null) {
         stringBuilder.append(first.val);
         first = first.next;
      }

      assertEquals("12345", stringBuilder.toString());
   }

}