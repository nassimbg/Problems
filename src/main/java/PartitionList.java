import common.ListNode;

public class PartitionList {
   /**
    * use two dummies:
    *    1- dummyHead: having children as nodes with values < x
    *    2- dummyX: having children as nodes with values >= x
    *  At the end connect he last child of dummyHead with the first child of dummyX
    *  and finally null the next of the last child of dummyX in order to prevent cycles
    */
   public static ListNode partition(ListNode head, int x) {
      ListNode dummyX= new ListNode(x);
      ListNode lastAfterX = dummyX;

      ListNode dummyStart = new ListNode(x);
      ListNode lastBeforeX = dummyStart;

      while (head != null) {

         if (head.val < x) {
            lastBeforeX.next = head;
            lastBeforeX = lastBeforeX.next;
         } else {
            lastAfterX.next = head;
            lastAfterX = lastAfterX.next;
         }
         head = head.next;
      }

      lastBeforeX.next = dummyX.next;
      lastAfterX.next = null;

      return dummyStart.next;
   }
}
