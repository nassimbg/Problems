import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ReconstructItineraryTest {

   @Test
   public void findItinerary() {
       String[][] tickets = new String[][] {
        {"MUC", "LHR"},
        {"JFK", "MUC"},
        {"SFO", "SJC"},
        {"LHR", "SFO"}
      };
      assertEquals(Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC"), ReconstructItinerary.findItinerary(tickets));
   }

   @Test
   public void findItinerary2() {
      String[][] tickets = new String[][] {
        {"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}
      };
      assertEquals(Arrays.asList("JFK","ATL","JFK","SFO","ATL","SFO"), ReconstructItinerary.findItinerary(tickets));
   }
}