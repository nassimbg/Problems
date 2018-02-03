import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {

   Deque<Integer> stack1 = new ArrayDeque<>();
   Deque<Integer> stack2 = new ArrayDeque<>();
   /** Initialize your data structure here. */
   public MyQueue() {

   }

   /** Push element x to the back of queue. */
   public void push(int x) {
      stack1.addLast(x);

   }

   /** Removes the element from in front of queue and returns that element. */
   public int pop() {
      transferFromStack1To2();

      return stack2.pollLast();

   }

   private void transferFromStack1To2() {
      if (stack2.isEmpty()) {
         while (!stack1.isEmpty()) {
            stack2.addLast(stack1.pollLast());
         }
      }
   }

   /** Get the front element. */
   public int peek() {
      transferFromStack1To2();

      return stack2.peekLast();
   }

   /** Returns whether the queue is empty. */
   public boolean empty() {
      return stack2.isEmpty() && stack1.isEmpty();
   }
}
