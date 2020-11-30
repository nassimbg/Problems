import org.junit.Test;

import static org.junit.Assert.*;

public class DesignCircularDequeTest {

  @Test
  public void test1() {
    DesignCircularDeque.MyCircularDeque circularDeque = new DesignCircularDeque.MyCircularDeque(3); // set the size to be 3
    assertTrue(circularDeque.insertLast(1));			// return true
    assertTrue(circularDeque.insertLast(2));      // return true
    assertTrue(circularDeque.insertFront(3));      // return true
    assertFalse(circularDeque.insertFront(4));      // return false, the queue is full
    assertEquals(2, circularDeque.getRear());        // return 2
    assertTrue(circularDeque.isFull());        // return true
    assertTrue(circularDeque.deleteLast());      // return true
    assertTrue(circularDeque.insertFront(4));      // return true
    assertEquals(4, circularDeque.getFront());      // return 4
  }
}
