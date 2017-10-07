import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PermutationsTest {
   @Test
   public void permute1() throws Exception {
      assertEquals(new ArrayList<>(), Permutations.permute(new int[]{1,2,3}));
   }

}