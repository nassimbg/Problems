import org.junit.Test;

public class SwapNidesInPairsTest {
   @Test
   public void swapPairs() throws Exception {

      SwapNidesInPairs.ListNode first = new SwapNidesInPairs.ListNode(1);
      SwapNidesInPairs.ListNode second = new SwapNidesInPairs.ListNode(2);
      SwapNidesInPairs.ListNode third = new SwapNidesInPairs.ListNode(3);
      SwapNidesInPairs.ListNode fourth = new SwapNidesInPairs.ListNode(4);

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