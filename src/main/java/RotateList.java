import common.ListNode;

public class RotateList {

   public static ListNode rotateRight(ListNode head, int k) {
      if (head == null) {
         return head;
      }
      ListNode end = head;

      int count = 0;
      while (count < k && end.next != null) {
         end = end.next;
         ++count;
      }

      if (k > count) {
         k = k % (count + 1);
         count = 0;
         end = head;
         while (count < k && end.next != null) {
            end = end.next;
            ++count;
         }
      }

      ListNode first = head;

      while (end.next != null) {
         end = end.next;
         first = first.next;
      }

      end.next = head;
      head = first.next;
      first.next = null;

      return head;
   }
}
