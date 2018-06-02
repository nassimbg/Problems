import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import common.NestedInteger;

public class NestedListWeightSumIITest {

   @Test
   public void depthSumInverse() {

      List<NestedInteger> list = new ArrayList<>();
      list.add(new NestedIntegerList(Arrays.asList(new NestedIntegerInt(1), new NestedIntegerInt(1))));
      list.add(new NestedIntegerInt(2));
      list.add(new NestedIntegerList(Arrays.asList(new NestedIntegerInt(1), new NestedIntegerInt(1))));

      assertEquals(8, NestedListWeightSumII.depthSumInverse(list));
   }

   @Test
   public void depthSumInverse2() {

      NestedIntegerList second = new NestedIntegerList(Arrays.asList(new NestedIntegerInt(6)));
      NestedIntegerList first = new NestedIntegerList(Arrays.asList(new NestedIntegerInt(4), second));



      assertEquals(17, NestedListWeightSumII.depthSumInverse(Arrays.asList( new NestedIntegerInt(1), first)));

   }

   private static class NestedIntegerInt implements NestedInteger {

      private final int val;

      NestedIntegerInt(int val) {

         this.val = val;
      }

      @Override
      public boolean isInteger() {
         return true;
      }

      @Override
      public Integer getInteger() {
         return val;
      }

      @Override
      public List<NestedInteger> getList() {
         return null;
      }
   }

   private static class NestedIntegerList implements NestedInteger {

      private final List<NestedInteger> list;

      NestedIntegerList(List<NestedInteger> list) {

         this.list = list;
      }

      @Override
      public boolean isInteger() {
         return false;
      }

      @Override
      public Integer getInteger() {
         return null;
      }

      @Override
      public List<NestedInteger> getList() {
         return list;
      }
   }
}