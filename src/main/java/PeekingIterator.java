import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {

   private final Iterator<Integer> iterator;
   private Integer peekValue;
   private boolean isOutDated;

   public PeekingIterator(Iterator<Integer> iterator) {
      // initialize any member here.

      this.isOutDated = true;
      this.iterator = iterator;
   }

   // Returns the next element in the iteration without advancing the iterator.
   public Integer peek() {
      if (isOutDated) {
         peekValue = iterator.next();
         isOutDated = false;
      }

      return peekValue;
   }

   // hasNext() and next() should behave the same as in the Iterator interface.
   // Override them if needed.
   @Override
   public Integer next() {

      if (isOutDated) {
         return iterator.next();
      }
      isOutDated = true;

      return peekValue;
   }

   @Override
   public boolean hasNext() {
      return iterator.hasNext() || !isOutDated;
   }

}
