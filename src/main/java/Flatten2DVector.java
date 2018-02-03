import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * what if u have [
 * [3,4],
 * [],
 * [],
 * [2]
 * ]
 *
 * for the above scenario, thats why we have the while loop in the hasNext()
 */
public class Flatten2DVector implements Iterator<Integer> {

   private final List<List<Integer>> values;
   private int listNumber = 0;
   private int positionInList = 0;

   Flatten2DVector(List<List<Integer>> values) {

      this.values = values;
   }

   @Override
   public boolean hasNext() {

      while(listNumber < values.size()) {
         if (positionInList < values.get(listNumber).size() - 1) {
            return true;
         }
         positionInList = 0;
         ++listNumber;
      }
      return false;
   }

   @Override
   public Integer next() {
      return values.get(listNumber).get(positionInList++);
   }

   @Override
   public void remove() {

   }

   @Override
   public void forEachRemaining(Consumer<? super Integer> action) {

   }
}
