import java.util.List;

import common.NestedInteger;

public class NestedListWeightSumII {
   public static int depthSumInverse(List<NestedInteger> nestedList) {
      return sum(nestedList).sum;
   }

   private static ResultMetaData sum(List<NestedInteger> nestedIntegers) {
      if (nestedIntegers == null) {
         return new ResultMetaData(0, 1);
      }

      int maxDep = 1;
      int listSum = 0;
      int intSum = 0;
      for(NestedInteger nestedInteger: nestedIntegers) {
         if (!nestedInteger.isInteger()) {
            ResultMetaData resultMetaData = sum(nestedInteger.getList());

            listSum+=resultMetaData.sum;
            maxDep = Math.max(maxDep, resultMetaData.depth);
         } else {
            intSum += nestedInteger.getInteger();
         }
      }

      return new ResultMetaData(listSum + (intSum * maxDep), maxDep + 1);
   }

   private static class ResultMetaData {
      int sum;
      int depth;

      ResultMetaData(int sum, int depth) {
         this.sum = sum;
         this.depth = depth;
      }
   }
}
