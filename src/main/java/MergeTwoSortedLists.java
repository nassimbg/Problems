public class MergeTwoSortedLists {

   public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

      ListNode dummyFirst = new ListNode(0);

      ListNode current = dummyFirst;
      while (l1 != null && l2!= null) {

         if(l1.val < l2.val) {
            current.next = l1;
            l1 = l1.next;
         } else {
            current.next = l2;
            l2 = l2.next;
         }

         current = current.next;
      }

      while (l1 != null) {
         current.next = l1;
         l1 = l1.next;
         current = current.next;
      }

      while (l2 != null) {
         current.next = l2;
         l2 = l2.next;
         current = current.next;
      }

      return dummyFirst.next;

   }



     public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

}
