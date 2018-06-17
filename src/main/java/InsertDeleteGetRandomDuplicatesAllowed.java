import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class InsertDeleteGetRandomDuplicatesAllowed {

   static class RandomizedCollection {

      Map<Integer, Set<Integer>> valuesToIndex;
      List<Integer> values;
      Random random;

      /** Initialize your data structure here. */
      public RandomizedCollection() {
         valuesToIndex = new HashMap<>();
         values = new ArrayList<>();
         random =  new Random();
      }


      /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
      public boolean insert(int val) {


         int indexToAdd = values.size();
         values.add(val);
         Set<Integer> indecies = valuesToIndex.computeIfAbsent(val, k -> new HashSet<>());
         indecies.add(indexToAdd);

         return indecies.size() == 1;
      }

      /** Removes a value from the set. Returns true if the set contained the specified element. */
      public boolean remove(int val) {

         Set<Integer> indeciesOfValues = valuesToIndex.get(val);
         if (indeciesOfValues == null) {
            return false;
         }

         Iterator<Integer> iterator = indeciesOfValues.iterator();

         int indexToRemove = 0;
         if (iterator.hasNext()) {
            indexToRemove = iterator.next();
            iterator.remove();
         }

         if (!iterator.hasNext()) {
            valuesToIndex.remove(val);
         }

         int lastIndex = values.size() - 1;
         int value = values.remove(lastIndex);
         if (lastIndex != indexToRemove) {
            Set<Integer> indecies = valuesToIndex.get(value);
            indecies.remove(lastIndex);
            indecies.add(indexToRemove);
            values.set(indexToRemove, value);
         }

         return true;
      }

      /** Get a random element from the set. */
      public int getRandom() {
         int size = values.size();
         if (size > 0) {
            int randIndex = random.nextInt(size);
            return values.get(randIndex);
         }

         return 0;
      }
   }
}
