import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SummaryRangesTest {
   @Test
   public void summaryRanges() throws Exception {
      assertEquals(Arrays.asList("0->2","4->5","7"), SummaryRanges.summaryRanges(new int[]{0,1,2,4,5,7}));
   }


   @Test
   public void summaryRanges2() throws Exception {
      assertEquals(Arrays.asList("0","2->4","6","8->9"), SummaryRanges.summaryRanges(new int[]{0,2,3,4,6,8,9}));
   }


   @Test
   public void summaryRanges3() throws Exception {
      assertEquals(Arrays.asList("0","2", "4","6","9"), SummaryRanges.summaryRanges(new int[]{0,2,4,6,9}));
   }


}