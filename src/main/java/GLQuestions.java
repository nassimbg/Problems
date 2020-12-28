import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GLQuestions {

  public static final class NumberOfIslands {
    public static int solution(int[][] A) {
      UnionFind<Coordinates> unionFind = new UnionFind<>();

      for (int row = 0; row < A.length; row++) {
        for (int col = 0; col < A[row].length; col++) {
          unionFind.addSet(new Coordinates(row, col));
        }
      }


      for (int row = 0; row < A.length; row++) {
        for (int column = 0; column < A[row].length; column++) {
          Coordinates repOfCurrent = new Coordinates(row, column);
          int currentValue = A[row][column];

          if (row > 0 && currentValue == A[row - 1][column]) {
            unionFind.union(repOfCurrent, new Coordinates(row - 1, column));
          }

          if (row + 1 < A.length && currentValue == A[row + 1][column]) {
            unionFind.union(repOfCurrent, new Coordinates(row + 1, column));
          }

          if (column > 0 && currentValue == A[row][column - 1]) {
            unionFind.union(repOfCurrent, new Coordinates(row, column - 1));
          }

          if (column + 1 < A[0].length && currentValue == A[row][column + 1]) {
            unionFind.union(repOfCurrent, new Coordinates(row, column + 1));
          }
        }
      }

      return unionFind.numberOfDistjointSets();
    }

    public static final class Coordinates {
      private final int x;
      private final int y;

      Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
      }

      public int getX() {
        return x;
      }

      public int getY() {
        return y;
      }

      @Override
      public String toString() {
        return "Coordinates{" +
            "x=" + x +
            ", y=" + y +
            '}';
      }

      @Override
      public boolean equals(final Object o) {
        if (this == o) {
          return true;
        }
        if (o == null || getClass() != o.getClass()) {
          return false;
        }
        final Coordinates that = (Coordinates) o;
        return x == that.x &&
            y == that.y;
      }

      @Override
      public int hashCode() {
        return Objects.hash(x, y);
      }
    }

    public static class UnionFind<K> {
      private final Map<K, Node<K>> pie;
      private int sizeOFDisjointSets;

      public UnionFind() {
        pie = new HashMap<>();
      }

      public void addSet(K key) {
        sizeOFDisjointSets++;
        pie.put(key, new Node<>(key));
      }

      public K findRootOfSet(K key) {
        return findRootNodeOfSet(key).key;
      }

      private Node<K> findRootNodeOfSet(K key) {
        Node<K> node = pie.get(key);

        while(node.parent != null) {
          node = node.parent;
        }

        Node<K> current = pie.get(key);

        // we can compare on address
        while(node != current) {
          Node<K> temp = current.parent;
          current.parent = node;
          current = temp;
        }

        return node;
      }

      public boolean union(K k1, K k2) {
        Node<K> rootOfK1 = findRootNodeOfSet(k1);
        Node<K> rootOfK2 = findRootNodeOfSet(k2);

        if (rootOfK1 == rootOfK2) {
          return false;
        }

        sizeOFDisjointSets--;
        if (rootOfK1.size > rootOfK2.size) {
          rootOfK2.parent = rootOfK1;
          rootOfK1.size += rootOfK2.size;
        } else {
          rootOfK1.parent = rootOfK2;
          rootOfK2.size += rootOfK1.size;
        }

        return true;
      }

      public int numberOfDistjointSets() {
        return sizeOFDisjointSets;
      }

      private static final class Node<K> {
        private final K key;
        private int size;
        private Node<K> parent;

        private Node(K key) {
          this.key = key;
          this.size = 1;
        }
      }
    }
  }

  public static final class BinomialFunction {
    public static int solution(int N, int K) {
      if (N < 0 || K < 0 || K > N) {
        return -1;
      }

      int limit = K;
      if (N - K < K) {
        limit = N - K;
      }

      long result = 1;

      for (int k = 0; k < limit; k++) {
        result *= (N - k);
        result /= (k + 1);

        if (result > 1_000_000_000) {
          return -1;
        }
      }

      return (int)result;
    }


    public static int solution2(int N, int K) {
      if (N < 0 || K < 0 || K > N) {
        return -1;
      }

      int limit = K;
      if (N - K < K) {
        limit = N - K;
      }

      long result = 1;

      for (int k = 0; k < limit; k++) {
        result *= (N - k);
        result /= (k + 1);
        //todo can we check here for more than 1B?
      }

      return result > 1_000_000_000 ? -1 : (int) result;
    }
  }
}
