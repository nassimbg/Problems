import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class AllOne {


   private final Map<String, BucketNode> bucketsValue = new HashMap<>();
   private BucketNode first;
   private BucketNode last;


   /** Initialize your data structure here. */
   public AllOne() {

   }


   /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
   public void inc(String key) {
      BucketNode correspondingBucket = bucketsValue.get(key);
      BucketNode nextBucket;

      if (correspondingBucket == null) {
         nextBucket = addToFirstBucket();
      } else {
         nextBucket = addToNextBucket(key, correspondingBucket);
      }

      bucketsValue.put(key, nextBucket);
      nextBucket.values.add(key);
      if (last == null) {
         last = nextBucket;
      }
   }

   private BucketNode addToNextBucket(String key, BucketNode correspondingBucket) {
      BucketNode nextBucket;
      int nextValue = correspondingBucket.value + 1;
      correspondingBucket.values.remove(key);

      nextBucket = correspondingBucket.child;
      if (nextBucket == null || nextBucket.value != nextValue) {
         nextBucket = new BucketNode(nextValue);
         nextBucket.child = correspondingBucket.child;
         nextBucket.parent = correspondingBucket;
         correspondingBucket.child = nextBucket;
      }

      if (last.value == correspondingBucket.value) {
         last = null;
      }

      if (correspondingBucket.values.isEmpty()) {
         if (correspondingBucket.parent == null) {
            first = nextBucket;
         } else {
            correspondingBucket.parent.child = nextBucket;
         }
         nextBucket.parent = correspondingBucket.parent;
      }
      return nextBucket;
   }

   private BucketNode addToFirstBucket() {
      BucketNode nextBucket;
      if (first == null || first.value > 1) {
         nextBucket = new BucketNode(1);
         nextBucket.child = first;

         if (first != null) {
            first.parent = nextBucket;
         }
         first = nextBucket;
      } else {
         nextBucket = first;
      }
      return nextBucket;
   }

   /** Decrements an existing key by 1. if Key's value is 1, remove it from the data structure. */
   public void dec(String key) {
      BucketNode correspondingBucket = bucketsValue.get(key);

      if (correspondingBucket != null) {
         addToPreviousBucket(key, correspondingBucket);
      }
   }

   private void addToPreviousBucket(String key, BucketNode correspondingBucket) {
      BucketNode previousBucket;
      int nextValue = correspondingBucket.value - 1;
      correspondingBucket.values.remove(key);

      if (nextValue > 0) {
         previousBucket = correspondingBucket.parent;

         if (previousBucket != null && previousBucket.value == nextValue) {
            bucketsValue.put(key, previousBucket);
         } else {
            previousBucket = new BucketNode(nextValue);
            previousBucket.parent = correspondingBucket.parent;
            previousBucket.child = correspondingBucket;
            correspondingBucket.parent = previousBucket;
         }

         if (first.value == correspondingBucket.value) {
            first = null;
         }

         if (correspondingBucket.values.isEmpty()) {
            if (correspondingBucket.child == null) {
               last = previousBucket;
               previousBucket.child = null;
            } else {
               previousBucket.child = correspondingBucket.child;
               previousBucket.child.parent = previousBucket;
            }
         }
         bucketsValue.put(key, previousBucket);
         previousBucket.values.add(key);
         if (first == null) {
            first = previousBucket;
         }
      } else {
         bucketsValue.remove(key);
         if (correspondingBucket.values.isEmpty()) {
            first = correspondingBucket.child;


            if (first == null) {
               last = null;
            } else {
               first.parent = null;
            }
         }
      }
   }

   /** Returns one of the keys with maximal value. */
   public String getMaxKey() {
      return last == null ? "" : last.values.iterator().next();
   }

   /** Returns one of the keys with Minimal value. */
   public String getMinKey() {
      return first == null ? "" : first.values.iterator().next();
   }


   private static final class BucketNode {
      private BucketNode parent;
      private BucketNode child;
      private int value;
      private Set<String> values;

      BucketNode(int value) {
         this.value = value;
         this.values = new HashSet<>();
      }

   }
}


