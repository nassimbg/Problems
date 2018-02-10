import java.util.Iterator;
import java.util.List;

public class ZigzagIterator implements Iterator<Integer> {

   private final List<List<Integer>> vectors;
   private int currentVector = 0;
   private int currentPosition = 0;

   ZigzagIterator(List<List<Integer>> vectors) {
      this.vectors = vectors;
   }

   @Override
   public boolean hasNext() {

      for (; currentVector<vectors.size(); ++currentVector) {
         if (currentPosition < vectors.get(currentVector).size()) {
            return true;
         }
      }
      return false;
   }

   @Override
   public Integer next() {
      int value = vectors.get(currentVector++).get(currentPosition);

      currentVector = currentVector % vectors.size();
      if (currentVector == 0) {
         ++currentPosition;
      }
      return value;
   }
}
