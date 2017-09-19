import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseNodesInKGroupTest {
   @Test
   public void reverseKGroup1() throws Exception {

      ReverseNodesInKGroup.ListNode first = new ReverseNodesInKGroup.ListNode(1);
      ReverseNodesInKGroup.ListNode second = new ReverseNodesInKGroup.ListNode(2);
      ReverseNodesInKGroup.ListNode third = new ReverseNodesInKGroup.ListNode(3);
      ReverseNodesInKGroup.ListNode fourth = new ReverseNodesInKGroup.ListNode(4);
      ReverseNodesInKGroup.ListNode fifth = new ReverseNodesInKGroup.ListNode(5);
      ReverseNodesInKGroup.ListNode six = new ReverseNodesInKGroup.ListNode(6);

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

      ReverseNodesInKGroup.ListNode first = new ReverseNodesInKGroup.ListNode(1);
      ReverseNodesInKGroup.ListNode second = new ReverseNodesInKGroup.ListNode(2);
      ReverseNodesInKGroup.ListNode third = new ReverseNodesInKGroup.ListNode(3);
      ReverseNodesInKGroup.ListNode fourth = new ReverseNodesInKGroup.ListNode(4);
      ReverseNodesInKGroup.ListNode fifth = new ReverseNodesInKGroup.ListNode(5);

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

      ReverseNodesInKGroup.ListNode first = new ReverseNodesInKGroup.ListNode(1);
      ReverseNodesInKGroup.ListNode second = new ReverseNodesInKGroup.ListNode(2);
      ReverseNodesInKGroup.ListNode third = new ReverseNodesInKGroup.ListNode(3);
      ReverseNodesInKGroup.ListNode fourth = new ReverseNodesInKGroup.ListNode(4);
      ReverseNodesInKGroup.ListNode fifth = new ReverseNodesInKGroup.ListNode(5);

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

      ReverseNodesInKGroup.ListNode first = new ReverseNodesInKGroup.ListNode(1);
      ReverseNodesInKGroup.ListNode second = new ReverseNodesInKGroup.ListNode(2);
      ReverseNodesInKGroup.ListNode third = new ReverseNodesInKGroup.ListNode(3);
      ReverseNodesInKGroup.ListNode fourth = new ReverseNodesInKGroup.ListNode(4);
      ReverseNodesInKGroup.ListNode fifth = new ReverseNodesInKGroup.ListNode(5);

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