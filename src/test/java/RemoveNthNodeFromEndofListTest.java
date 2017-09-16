import org.junit.Test;

public class RemoveNthNodeFromEndofListTest {
   @Test
   public void removeNthFromEnd() throws Exception {

      RemoveNthNodeFromEndofList.ListNode head = new RemoveNthNodeFromEndofList.ListNode(1);
      head.next = new RemoveNthNodeFromEndofList.ListNode(2);

      RemoveNthNodeFromEndofList.ListNode listNode = RemoveNthNodeFromEndofList.removeNthFromEnd(head, 1);

      while (listNode != null) {
         System.out.print(listNode.val);
         listNode = listNode.next;
      }
   }

}