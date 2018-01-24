import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShortestWordDistanceTest {
   @Test
   public void shortestDistance() throws Exception {
      assertEquals(3, ShortestWordDistance.shortestDistance2(new String[] { "practice", "makes", "perfect", "coding", "makes" }, "coding", "practice"));

   }


   @Test
   public void shortestDistance2() throws Exception {
      assertEquals(1, ShortestWordDistance.shortestDistance2(new String[] { "practice", "makes", "perfect", "coding", "makes" }, "coding", "makes"));

   }

   @Test
   public void shortestDistance3() throws Exception {
      assertEquals(3, ShortestWordDistance.shortestDistance2(new String[] { "practice", "makes", "perfect", "coding", "makes" }, "makes", "makes"));

   }


}