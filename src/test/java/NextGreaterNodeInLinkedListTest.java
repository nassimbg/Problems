import static common.ListNode.generateListNode;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import common.ListNode;

public class NextGreaterNodeInLinkedListTest {

   @Test
   public void nextLargerNodes() {
      ListNode listNode = generateListNode(new int[] { 2, 1, 5 });

      assertEquals("[5, 5, 0]", Arrays.toString(NextGreaterNodeInLinkedList.nextLargerNodes(listNode)));
   }

   @Test
   public void nextLargerNodes1() {
      ListNode listNode = generateListNode(new int[] { 2,7,4,3,5});

      assertEquals("[7, 0, 5, 5, 0]", Arrays.toString(NextGreaterNodeInLinkedList.nextLargerNodes(listNode)));
   }

   @Test
   public void nextLargerNodes2() {
      ListNode listNode = generateListNode(new int[] { 2, 1, 5 });

      assertEquals("[5, 5, 0]", Arrays.toString(NextGreaterNodeInLinkedList.nextLargerNodes(listNode)));
   }
}