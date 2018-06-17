import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandom {


   static class RandomizedSet {

      Map<Integer, Integer> valuesToIndex;
      List<Integer> values;
      Random random;

      /** Initialize your data structure here. */
      public RandomizedSet() {
         valuesToIndex = new HashMap<>();
         values = new ArrayList<>();
         random =  new Random();
      }


      /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
      public boolean insert(int val) {

         if (valuesToIndex.get(val) != null) {
            return false;
         }

         int indexToAdd = values.size();
         values.add(val);
         valuesToIndex.put(val, indexToAdd);

         return true;

      }

      /** Removes a value from the set. Returns true if the set contained the specified element. */
      public boolean remove(int val) {

         Integer indexToRemove = valuesToIndex.remove(val);
         if (indexToRemove == null) {
            return false;
         }

         int lastIndex = values.size() - 1;
         int value = values.remove(lastIndex);
         if (lastIndex != indexToRemove) {
            valuesToIndex.replace(value,indexToRemove);
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
