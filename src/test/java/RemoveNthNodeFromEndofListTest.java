import org.junit.Test;

import common.ListNode;

public class RemoveNthNodeFromEndofListTest {
   @Test
   public void removeNthFromEnd() throws Exception {

      ListNode head = new ListNode(1);
      head.next = new ListNode(2);

      ListNode listNode = RemoveNthNodeFromEndofList.removeNthFromEndNonRecursive   (head, 1);

      while (listNode != null) {
         System.out.print(listNode.val);
         listNode = listNode.next;
      }
   }

}