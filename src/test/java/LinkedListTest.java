import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

   @Test
   public void add() {
      MyLinkedList<Integer> list = new MyLinkedList<>();
      list.add(2);
      list.add(3);

      assertEquals("2->3", list.toString());
   }

   @Test
   public void add1() {

      MyLinkedList<Integer> list = new MyLinkedList<>();
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(2, 5);

      assertEquals("2->3->5->4", list.toString());
   }

   @Test
   public void addI2() {

      MyLinkedList<Integer> list = new MyLinkedList<>();
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(3, 5);

      assertEquals("2->3->4->5", list.toString());
   }

   @Test
   public void remove() {
      MyLinkedList<Integer> list = new MyLinkedList<>();
      list.add(0, 5);

      assertEquals("5", list.toString());
   }
}