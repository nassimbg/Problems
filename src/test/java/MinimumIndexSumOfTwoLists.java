import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {
   public String[] findRestaurant(String[] list1, String[] list2) {
      if (list1 == null || list1.length == 0 || list2 == null || list2.length == 0) {
         return new String[0];
      }

      String[] smallerList = list1;
      String[] biggerList = list2;
      if (list1.length > list2.length) {
         biggerList = list1;
         smallerList = list2;
      }

      Map<String, Integer> indexOfString = new HashMap<>();
      for (int i = 0; i < smallerList.length; i++) {
         indexOfString.put(smallerList[i], i);
      }

      int minIndexSum = Integer.MAX_VALUE;
      List<String> restaurants = new ArrayList<>();
      for (int i = 0; i < biggerList.length; i++) {
         Integer indexInSmaller = indexOfString.get(biggerList[i]);

         if (indexInSmaller != null) {
            int summation = i + indexInSmaller;
            if (minIndexSum >= summation) {
               if (minIndexSum > summation) {
                  minIndexSum = summation;
                  restaurants = new ArrayList<>();
               }
               restaurants.add(biggerList[i]);
            }
         }
      }

      return restaurants.toArray(new String[0]);
   }
}
