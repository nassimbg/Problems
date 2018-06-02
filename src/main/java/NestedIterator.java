import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

import common.NestedInteger;

/**
 * problem: Flatten Nested List Iterator
 */
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

}
