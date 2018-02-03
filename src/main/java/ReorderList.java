import common.ListNode;

public class ReorderList {
   public static void reorderList(ListNode head) {
      if (head == null) {
         return;
      }

      ListNode last = head;
      int size = 1;

      while (last.next != null) {
         ++size;
         last = last.next;
      }

      int startingSecondList = (size / 2);

      int counter = 0;
      ListNode middle = head;
      while (startingSecondList > counter + 1) {
         ++counter;
         middle = middle.next;
      }

      ListNode temp = middle.next;
      middle.next = null;
      middle = temp;

      // pay attention to make next of first  null
      ListNode lead = middle;
      while (middle != null && middle.next != null) {
         ListNode next = middle.next;
         middle.next = next.next;
         next.next = lead;
         lead = next;
      }

      ListNode current1 = head;
      ListNode current2 = lead;

      while (current1 != null && current2 != null) {
            ListNode inter1 = current1.next;
            ListNode inter2 = current2.next;
            current1.next = current2;
            if (inter1 != null) {
               current2.next = inter1;
            }

            current1 = inter1;
            current2 = inter2;
      }

      return;

   }
}
