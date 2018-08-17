import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumGeneticMutationTest {

   @Test
   public void minMutation() {
      assertEquals(3, MinimumGeneticMutation.minMutation("AAAAACCC", "AACCCCCC", new String[] {"AAAACCCC", "AAACCCCC", "AACCCCCC"}));
   }

   @Test
   public void minMutation2() {
      assertEquals(2, MinimumGeneticMutation.minMutation("AACCGGTT", "AAACGGTA", new String[] {"AACCGGTA", "AACCGCTA", "AAACGGTA"}));
   }

   @Test
   public void minMutation3() {
      assertEquals(1, MinimumGeneticMutation.minMutation("AACCGGTT", "AACCGGTA", new String[] {"AACCGGTA"}));
   }
}