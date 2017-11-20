import java.util.Random;

import common.ListNode;

public class SortList {
   public static ListNode sortList(ListNode head) {

      int size = 0;
      ListNode current = head;
      while (current != null) {
         ++size;
         current = current.next;
      }
      return quickSort(head, size);
   }

   private static ListNode quickSort(ListNode head, int length) {
      if (length <= 1) {
         return head;
      }

      int pivotIndex = new Random().nextInt(length);

      ListNode pivot = head;

      for (int index = 0; index < pivotIndex; index++) {
         pivot = pivot.next;
      }
      int val = pivot.val;

      ListNode dummyLessThanPivot = new ListNode(-1);
      int sizeLessThan = 0;
      ListNode dummyEqualPivot = new ListNode(-1);
      ListNode dummyGreaterThanPivot = new ListNode(-1);
      int sizeGreaterThan = 0;

      ListNode current = head;
      while (current != null) {
         ListNode temp = current.next;
         if (current.val < val) {
            addToList(dummyLessThanPivot, current);
            ++sizeLessThan;
         } else if (current.val > val) {
            ++sizeGreaterThan;
            addToList(dummyGreaterThanPivot, current);
         } else {
            addToList(dummyEqualPivot, current);
         }
         current = temp;
      }

      ListNode lessThan = quickSort(dummyLessThanPivot.next, sizeLessThan);
      ListNode greaterThan = quickSort(dummyGreaterThanPivot.next, sizeGreaterThan);

      current = reachEndOfList(dummyEqualPivot.next);
      current.next = greaterThan;

      current = reachEndOfList(lessThan);
      if (current != null) {
         current.next = dummyEqualPivot.next;
         head = lessThan;
      } else {
         head = dummyEqualPivot.next;
      }
      return head;
   }

   private static ListNode reachEndOfList(ListNode dummy) {
      ListNode current = dummy;
      if (current != null) {
         while (current.next != null) {
            current = current.next;
         }
      }
      return current;
   }

   private static void addToList(ListNode dummy, ListNode current) {
      current.next = dummy.next;
      dummy.next = current;
   }
}
