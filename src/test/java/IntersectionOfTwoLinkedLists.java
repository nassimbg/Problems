import common.ListNode;

public class IntersectionOfTwoLinkedLists {
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      int listASize = listSize(headA);
      int listBSize = listSize(headB);

      int minSize = Math.min(listASize, listBSize);

      ListNode positionToStartWithInA = placeToStartWith(headA, listASize, minSize);
      ListNode positionToStartWithInB = placeToStartWith(headB, listBSize, minSize);

      while (positionToStartWithInA != null && positionToStartWithInB != null) {
         if (positionToStartWithInA == positionToStartWithInB) {
            return positionToStartWithInA;
         }
         positionToStartWithInA = positionToStartWithInA.next;
         positionToStartWithInB = positionToStartWithInB.next;

      }

      return null;
   }

   private ListNode placeToStartWith(ListNode headB, int listBSize, int minSize) {
      ListNode current = headB;
      while(listBSize > minSize) {
         current = current.next;
         --listBSize;
      }

      return current;
   }

   private int listSize(ListNode headA) {
      ListNode current = headA;
      int listASize = 0;
      while (current != null) {
         ++listASize;
         current = current.next;
      }
      return listASize;
   }
}
