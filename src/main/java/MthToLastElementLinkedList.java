import java.util.Scanner;

import common.ListNode;

public class MthToLastElementLinkedList {

   public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scanner = new Scanner(System.in);

      int indexToFind = scanner.nextInt();

      ListNode head = new ListNode(0);
      ListNode curr = head;
      while (scanner.hasNextInt()) {
         curr.next = new ListNode(scanner.nextInt());
         curr = curr.next;
      }

      head = head.next;

      ListNode fast = head;
      for (int index = 0; index < indexToFind ; index++) {
         fast = fast.next;

         if (fast == null) {
            System.out.println("NIL");
            return;
         }
      }

      ListNode slow = head;
      while (fast != null) {
         slow = slow.next;
         fast = fast.next;
      }

      System.out.println(slow.val);
   }
}
