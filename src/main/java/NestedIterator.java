import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class NestedIterator implements Iterator<Integer> {

   private final Deque<Iterator<NestedInteger>> stackList;
   private int value;

   public NestedIterator(List<NestedInteger> nestedList) {

      this.stackList = new ArrayDeque<>();
      stackList.addLast(nestedList.iterator());

   }

   @Override
   public Integer next() {
      return value;
   }

   @Override
   public boolean hasNext() {
      while (!stackList.isEmpty()) {
         Iterator<NestedInteger> currentList = stackList.peekLast();

         if (!currentList.hasNext()) {
            stackList.pollLast();
         } else {
            NestedInteger nestedInteger = currentList.next();

            if (nestedInteger.isInteger()) {
               value = nestedInteger.getInteger();
               return true;
            } else {
               Iterator<NestedInteger> nestedIntegerList = nestedInteger.getList().iterator();
               stackList.add(nestedIntegerList);
            }
         }
      }
      return false;
   }

   // This is the interface that allows for creating nested lists.
   // You should not implement it, or speculate about its implementation
   public interface NestedInteger {

      // @return true if this NestedInteger holds a single integer, rather than a nested list.
      public boolean isInteger();

      // @return the single integer that this NestedInteger holds, if it holds a single integer
      // Return null if this NestedInteger holds a nested list
      public Integer getInteger();

      // @return the nested list that this NestedInteger holds, if it holds a nested list
      // Return null if this NestedInteger holds a single integer
      public List<NestedInteger> getList();
   }
}
