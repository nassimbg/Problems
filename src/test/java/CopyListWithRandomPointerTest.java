import org.junit.Test;

import common.RandomListNode;

public class CopyListWithRandomPointerTest {
   @Test
   public void copyRandomList() throws Exception {
      RandomListNode one = new RandomListNode(-1);
      RandomListNode two = new RandomListNode(2);
      RandomListNode three = new RandomListNode(3);
      RandomListNode four = new RandomListNode(4);

      one.next = two;
      one.random = three;

      two.next = three;
      two.random = two;

      three.next= four;
      three.random = one;

      four.random = two;

      CopyListWithRandomPointer.copyRandomList(one);

   }


}