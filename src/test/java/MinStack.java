import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {

   private final List<Integer> minList;
   private final Stack<Integer> stack;
   /** initialize your data structure here. */
   public MinStack() {
      this.minList = new ArrayList<>();
      this.stack = new Stack<>();
   }

   public void push(int x) {
      stack.push(x);

      if (!minList.isEmpty()) {
         if (minList.get(minList.size() - 1) > x){
            minList.add(x);
         }
      } else {
         minList.add(x);
      }

   }

   public void pop() {
      Integer pop = stack.pop();

      if (!minList.isEmpty() && minList.get(minList.size() - 1).equals(pop)) {
         minList.remove(minList.size() - 1);
      }

   }

   public int top() {
         return stack.peek();
   }

   public int getMin() {
      return minList.get(minList.size() - 1);
   }
}
