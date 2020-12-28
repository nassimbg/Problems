package common;

import java.util.HashMap;
import java.util.Map;

public class UnionFind<K> {
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
