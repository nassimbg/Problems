import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MedianFinderTest {

   @Test
   public void addNum() {
      MedianFinder medianFinder = new MedianFinder();

      medianFinder.addNum(-1);

      assertEquals(-1, medianFinder.findMedian(), 0.1);

      medianFinder.addNum(-2);
      assertEquals(-1.5, medianFinder.findMedian(), 0.1);


      medianFinder.addNum(-3);
      assertEquals(-2, medianFinder.findMedian(), 0.1);


      medianFinder.addNum(-4);
      assertEquals(-2.5, medianFinder.findMedian(), 0.1);


      medianFinder.addNum(-5);
      assertEquals(-3, medianFinder.findMedian(), 0.1);
   }


   @Test
   public void addNum2() {
      MedianFinder medianFinder = new MedianFinder();

      medianFinder.addNum(1);
      medianFinder.addNum(2);

      assertEquals(1.5, medianFinder.findMedian(), 0.1);


      medianFinder.addNum(3);
      assertEquals(2, medianFinder.findMedian(), 0.1);
   }

}