import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import common.Interval;

public class InsertIntervalTest {
   @Test
   public void insert() throws Exception {
      Interval first = new Interval(1, 3);
      Interval second = new Interval(6, 9);

      assertEquals(Arrays.asList(new Interval(1, 5), second), InsertInterval.insert(Arrays.asList(first, second), new Interval(2, 5)));

   }

   @Test
   public void insert2() throws Exception {
      Interval first = new Interval(1,2);
      Interval second = new Interval(3,5);
      Interval three = new Interval(6,7);
      Interval four = new Interval(8,10);
      Interval five = new Interval(12,16);

      assertEquals(Arrays.asList(first, new Interval(3, 10) ,five), InsertInterval.insert(Arrays.asList(first, second, three, four, five), new Interval(4, 9)));

   }

   @Test
   public void insert3() throws Exception {
      Interval first = new Interval(1,2);
      Interval second = new Interval(3,5);
      Interval three = new Interval(3,4);

      Interval interval = new Interval(4, 10);
      assertEquals(Arrays.asList(first, new Interval(3, 10)), InsertInterval.insert(Arrays.asList(first, second, three), interval));

   }

   @Test
   public void insert4() throws Exception {
      Interval first = new Interval(1,5);

      Interval interval = new Interval(6, 8);
      assertEquals(Arrays.asList(first, interval), InsertInterval.insert(Arrays.asList(first), interval));

   }

   @Test
   public void insert5() throws Exception {
      Interval first = new Interval(1,5);

      Interval interval = new Interval(0, 3);
      assertEquals(Arrays.asList(new Interval(0, 5)), InsertInterval.insert(Arrays.asList(first), interval));

   }

   @Test
   public void insert6() throws Exception {
      Interval first = new Interval(1,5);

      Interval interval = new Interval(0, 0);
      assertEquals(Arrays.asList(interval, first), InsertInterval.insert(Arrays.asList(first), interval));

   }

}