import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

   @Test
   public void add() {
      LinkedList<Integer> list = new LinkedList<>();
      list.add(2);
      list.add(3);

      assertEquals("2->3", list.toString());
   }

   @Test
   public void add1() {

      LinkedList<Integer> list = new LinkedList<>();
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(2, 5);

      assertEquals("2->3->5->4", list.toString());
   }

   @Test
   public void addI2() {

      LinkedList<Integer> list = new LinkedList<>();
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(3, 5);

      assertEquals("2->3->4->5", list.toString());
   }

   @Test
   public void remove() {
      LinkedList<Integer> list = new LinkedList<>();
      list.add(0, 5);

      assertEquals("5", list.toString());
   }
}