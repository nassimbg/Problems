import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
   public static List<Integer> getRow(int rowIndex) {
      List<Integer> result = new ArrayList<>(rowIndex);

      for (int level = 0; level <= rowIndex; level++) {
         for (int index = level; index >= 0; --index) {
            if (index == result.size()) {
               result.add(1);
            } else if (index == 0) {
               result.set(index, 1);
            } else {
               result.set(index, result.get(index) + result.get(index - 1));
            }
         }
      }

      return result;
   }
}
