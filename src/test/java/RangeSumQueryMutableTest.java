import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RangeSumQueryMutableTest {

   @Test
   public void testing() {
      RangeSumQueryMutable rangeSumQueryMutable = new RangeSumQueryMutable(new int[] { 1, 3, 5 });

      assertEquals(9, rangeSumQueryMutable.sumRange(0,2));
      rangeSumQueryMutable.update(1,2);
      assertEquals(8, rangeSumQueryMutable.sumRange(0,2));
   }

}