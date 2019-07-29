import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

import common.ListNode;

public class NextGreaterNodeInLinkedList {


   public static int[] nextLargerNodes(ListNode head) {

      ListNode reverse = reverse(head);

      LinkedList<Integer> results = new LinkedList<>();
      Deque<Integer> maxQueue = new ArrayDeque<>();

      ListNode current = reverse;
      while (current != null) {

         while (!maxQueue.isEmpty() && maxQueue.peekLast() <= current.val) {
            maxQueue.pollLast();
         }

         results.addFirst(!maxQueue.isEmpty() ? maxQueue.peekLast() : 0);
         maxQueue.addLast(current.val);

         current = current.next;
      }


      return results.stream().mapToInt(i->i).toArray();

   }

   private static ListNode reverse(ListNode head) {
      ListNode dummy = new ListNode(-1);

      ListNode current = head;
      while (current != null) {
         ListNode temp = current.next;
         current.next = dummy.next;
         dummy.next = current;

         current = temp;
      }

      return dummy.next;
   }
}
