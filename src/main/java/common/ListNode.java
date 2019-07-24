package common;

public class ListNode {
      public int val;
      public ListNode next;

      public ListNode(int x) {
         val = x;
      }

   @Override
   public String toString() {
      return val  + (next != null ? " -> " + next: "");
   }




   public static ListNode generateListNode(int[] array) {
      ListNode dummyH = new ListNode(-1);

      ListNode current = dummyH;
      for (int i : array) {
         current.next = new ListNode(i);
         current = current.next;
      }

      return dummyH.next;
   }
}