import static org.junit.Assert.*;

import org.junit.Test;

public class SortCharactersByFrequencyTest {

   @Test
   public void frequencySort() {
      assertEquals("eert", SortCharactersByFrequency.frequencySort("tree"));
   }

   @Test
   public void frequencySort2() {
      assertEquals("aaaccc", SortCharactersByFrequency.frequencySort("cccaaa"));
   }

   @Test
   public void frequencySort3() {
      assertEquals("bbAa", SortCharactersByFrequency.frequencySort("Aabb"));
   }
}