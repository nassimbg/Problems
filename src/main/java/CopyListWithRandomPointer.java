import java.util.HashMap;
import java.util.Map;

import common.RandomListNode;

public class CopyListWithRandomPointer {
   Map<RandomListNode, RandomListNode> cloner = new HashMap<>();

   public static RandomListNode copyRandomList(RandomListNode head) {
      RandomListNode dummy = new RandomListNode(0);
      dummy.next = head;

      RandomListNode dummyClone = new RandomListNode(0);
      dummy.random = dummyClone;

      RandomListNode current = dummy.next;

      while (current != null) {
         RandomListNode currentClone = new RandomListNode(current.label);
         currentClone.next = current.random;
         current.random = currentClone;
         current = current.next;
      }

      current = dummy.next;
      while (current != null) {

         RandomListNode currentClone = current.random;

         if (currentClone.next != null) {
            currentClone.random = currentClone.next.random;
         }
         current = current.next;
      }

      current = dummy;
      while (current != null) {

         RandomListNode currentClone =  current.random;
         current.random = currentClone.next;

         currentClone.next = current.next != null ? current.next.random : null;
         current = current.next;
      }

      return dummyClone.next;

   }


   public RandomListNode copyRandomListRec(RandomListNode head) {
      if (head == null) {
         return head;
      }

      RandomListNode clonedHead = cloner.get(head);

      if(clonedHead != null) {
         return clonedHead;
      }

      clonedHead = new RandomListNode(head.label);
      cloner.put(head, clonedHead);

      clonedHead.next = copyRandomListRec(head.next);
      clonedHead.random = copyRandomListRec(head.random);
      return clonedHead;
   }
}


