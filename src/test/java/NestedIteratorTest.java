import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NestedIteratorTest {

   @Test
   public void next() {

      NestedIntegerList first = new NestedIntegerList(Arrays.asList(new NestedIntegerInt(1), new NestedIntegerInt(1)));
      NestedIntegerList second = new NestedIntegerList(Arrays.asList(new NestedIntegerInt(1), new NestedIntegerInt(1)));


      NestedIterator nestedIterator = new NestedIterator(Arrays.asList(first, new NestedIntegerInt(2), second));

      List<Integer> actual = new ArrayList<>();
      while (nestedIterator.hasNext()) {
         actual.add(nestedIterator.next());
      }

      assertEquals(Arrays.asList(1, 1, 2, 1, 1),  actual);
   }

   @Test
   public void next2() {

      NestedIntegerList second = new NestedIntegerList(Arrays.asList(new NestedIntegerInt(6)));
      NestedIntegerList first = new NestedIntegerList(Arrays.asList(new NestedIntegerInt(4), second));


      NestedIterator nestedIterator = new NestedIterator(Arrays.asList( new NestedIntegerInt(1), first));

      List<Integer> actual = new ArrayList<>();
      while (nestedIterator.hasNext()) {
         actual.add(nestedIterator.next());
      }

      assertEquals(Arrays.asList(1, 4,6),  actual);
   }

   private static class NestedIntegerInt implements NestedIterator.NestedInteger {

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
      public List<NestedIterator.NestedInteger> getList() {
         return null;
      }
   }

   private static class NestedIntegerList implements NestedIterator.NestedInteger {

      private final List<NestedIterator.NestedInteger> list;

      NestedIntegerList(List<NestedIterator.NestedInteger> list) {

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
      public List<NestedIterator.NestedInteger> getList() {
         return list;
      }
   }
}