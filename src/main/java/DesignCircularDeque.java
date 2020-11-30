public class DesignCircularDeque {


  static class MyCircularDeque {

    private final int[] values;
    // pointing to the first empty spot
    private int first;
    // pointing to the last empty spot
    private int last;

    private int count;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
      this.values = new int[k];
      this.first = 0;
      this.last = this.values.length - 1;
      this.count = 0;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {

      if (isFull()) {
        return false;
      }

      this.values[first] = value;

      first = (first + 1) % this.values.length;

      count++;
      return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
      if (isFull()) {
        return false;
      }

      this.values[last] = value;

      if (--last < 0) {
        last = this.values.length - 1;
      }
      count++;
      return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {

      if (isEmpty()) {
        return false;
      }

      if (--first < 0) {
        first = this.values.length - 1;
      }

      count--;
      return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
      if (isEmpty()) {
        return false;
      }

      last = (last + 1) % this.values.length;

      count--;
      return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {

      if(isEmpty()) {
        return -1;
      }

      int currentFirst = first;
      if (--currentFirst < 0) {
        currentFirst = this.values.length - 1;
      }

      return this.values[currentFirst];
    }

    /** Get the last item from the deque. */
    public int getRear() {
      if(isEmpty()) {
        return -1;
      }

      int currentLast = (last + 1) % this.values.length;

      return this.values[currentLast];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
      return count == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
      return count == this.values.length;
    }
  }
}
