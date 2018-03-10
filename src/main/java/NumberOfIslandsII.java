import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class NumberOfIslandsII {
   UnionFind unionFind = new UnionFind();

   public List<Integer> numIslands2(int m, int n, int[][] positions) {

      List<Integer> sizes = new ArrayList<>();
      for (int i = 0; i < positions.length; i++) {
         int x = positions[i][0];
         int y = positions[i][1];

         if (x < m && y < n && x >=0 && y >= 0) {
            Coordinates current = unionFind.createSet(x, y);

            current = findAndTryToCombine(current, x - 1, y);
            current = findAndTryToCombine(current, x + 1, y);
            current = findAndTryToCombine(current,x, y - 1);
            current = findAndTryToCombine(current,x, y + 1);
         }

         sizes.add(unionFind.numberOfSets);

      }

      return sizes;
   }

   private Coordinates findAndTryToCombine(Coordinates current, int x, int y) {
      Coordinates neighboreSet = unionFind.findSet(x, y);
      if (neighboreSet != null) {
         current = unionFind.combineSets(current, neighboreSet);
      }
      return current;
   }

   public static final class UnionFind {
      Map<Coordinates, Coordinates> pie = new HashMap<>();
      Map<Coordinates, Integer> sizePerSet = new HashMap<>();
      int numberOfSets = 0;

      public Coordinates createSet(int x, int y) {
         ++numberOfSets;
         Coordinates coordinates = new Coordinates(x, y);
         pie.put(coordinates, null);
         sizePerSet.put(coordinates, 1);

         return coordinates;
      }

      public Coordinates findSet(int x, int y) {
         Coordinates coordinates = new Coordinates(x, y);

         if (!pie.containsKey(coordinates)) {
            return null;
         }

         Coordinates current = coordinates;
         Coordinates parent = pie.get(current);

         while (parent != null) {
            current = parent;
            parent = pie.get(current);
         }

         parent = pie.get(coordinates);
         while (parent != null) {
            pie.put(coordinates, current);
            coordinates = parent;
            parent = pie.get(coordinates);
         }

         return current;
      }

      public Coordinates combineSets(Coordinates first, Coordinates second) {
         --numberOfSets;
         int firstSize = sizePerSet.getOrDefault(first, 0);
         int secondSize = sizePerSet.getOrDefault(second, 0);

         if (firstSize > secondSize) {
            return combineChildeToParent(second, first);
         } else {
            return combineChildeToParent(first, second);
         }
      }

      private Coordinates combineChildeToParent(Coordinates child, Coordinates parent) {
         sizePerSet.computeIfPresent(parent, (k, v) -> v + sizePerSet.remove(child));
         pie.put(child, parent);
         return parent;
      }

   }

   public static final class Coordinates {
      int x;
      int y;

      Coordinates(int x, int y) {
         this.x = x;
         this.y = y;
      }

      @Override
      public boolean equals(Object o) {
         if (this == o) {
            return true;
         }
         if (!(o instanceof Coordinates)) {
            return false;
         }
         Coordinates that = (Coordinates) o;
         return x == that.x && y == that.y;
      }

      @Override
      public int hashCode() {

         return Objects.hash(x, y);
      }
   }
}
