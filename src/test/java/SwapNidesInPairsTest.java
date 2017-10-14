import org.junit.Test;

import common.ListNode;

public class SwapNidesInPairsTest {
   @Test
   public void swapPairs() throws Exception {

      ListNode first = new ListNode(1);
      ListNode second = new ListNode(2);
      ListNode third = new ListNode(3);
      ListNode fourth = new ListNode(4);

      first.next = second;
      second.next = third;
      third.next = fourth;

      first = SwapNidesInPairs.swapPairs(first);

      while (first != null) {
         System.out.print(first.val);
         first = first.next;
      }
   }

}