import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class NumberOfIslands {
   public static int numIslands(char[][] grid) {

      int numberOfIslands = 0;

      UnionFind unionFind = new UnionFind();
      for (int row = 0; row < grid.length; row++) {
         for (int column = 0; column < grid[0].length; column++) {
            if (grid[row][column] == '1') {
               unionFind.makeSet(new Coordinates(row, column));
               ++numberOfIslands;
            }
         }
      }

      for (int row = 0; row < grid.length; row++) {
         for (int column = 0; column < grid[0].length; column++) {
            if (grid[row][column] == '1') {
               Node repOfCurrent = unionFind.findSet(new Coordinates(row, column));

               if (row > 0 && grid[row - 1][column] == '1') {
                  Node repOfAdj = unionFind.findSet(new Coordinates(row - 1, column));

                  if (unionFind.union(repOfCurrent.coordinates, repOfAdj.coordinates)) {
                     --numberOfIslands;
                  }
               }

               if (row + 1 < grid.length && grid[row + 1][column] == '1') {
                  Node repOfAdj = unionFind.findSet(new Coordinates(row + 1, column));

                  if (unionFind.union(repOfCurrent.coordinates, repOfAdj.coordinates)) {
                     --numberOfIslands;
                  }
               }

               if (column > 0 && grid[row][column - 1] == '1') {
                  Node repOfAdj = unionFind.findSet(new Coordinates(row, column - 1));

                  if (unionFind.union(repOfCurrent.coordinates, repOfAdj.coordinates)) {
                     --numberOfIslands;
                  }
               }

               if (column + 1 < grid[0].length && grid[row][column + 1] == '1') {
                  Node repOfAdj = unionFind.findSet(new Coordinates(row, column + 1));

                  if (unionFind.union(repOfCurrent.coordinates, repOfAdj.coordinates)) {
                     --numberOfIslands;
                  }
               }
            }
         }
      }

      return numberOfIslands;

   }

   private static class UnionFind {
      Map<Coordinates, Node> nodes = new HashMap<>();

      void makeSet(Coordinates coordinates) {
         nodes.put(coordinates, new Node(coordinates));
      }

      Node findSet(Coordinates coordinates) {
         Node node = nodes.get(coordinates);

         Node rep = node;
         if (node != null) {
            while(rep.parent != null) {
               rep = rep.parent;
            }

            while (!rep.equals(node)) {
               Node tempParent = node.parent;
               node.parent = rep;
               node = tempParent;
            }
         }

         return rep;
      }

      boolean union(Coordinates coordinatesX, Coordinates coordinatesY) {
         Node repX = findSet(coordinatesX);
         Node repY = findSet(coordinatesY);

         if (repX.coordinates.equals(repY.coordinates)) {
            return false;
         }

         //todo we should increment the size of the parent with the new subtree size
         if (repX.size > repY.size) {
            repY.parent = repX;
         } else {
            repX.parent = repY;
         }

         return true;
      }
   }

   private static class Node {
      Coordinates coordinates;
      Node parent;
      int size;

      Node(Coordinates coordinates) {
         size = 1;
         this.coordinates = coordinates;
      }
   }

   private static class Coordinates {
      int row;
      int columns;

      Coordinates(int row, int column) {

         this.row = row;
         this.columns = column;
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
         return row == that.row && columns == that.columns;
      }

      @Override
      public int hashCode() {
         return Objects.hash(row, columns);
      }
   }
}
