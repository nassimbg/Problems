import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

public class PermutationsTest {
   @Test
   @Ignore
   public void permute1() throws Exception {
      assertEquals("[[1, 2, 3], [1, 3, 2], [2, 1, 3], [3, 1, 2], [2, 3, 1], [3, 2, 1]]", Permutations.permute(new int[]{1,2,3}).toString());
   }

   @Test
   @Ignore
   public void permute2() throws Exception {
      assertEquals("[[1, 1, 2], [1, 2, 1], [1, 1, 2], [2, 1, 1], [1, 2, 1], [2, 1, 1]]", Permutations.permute(new int[]{1,1, 2}).toString());
   }

//   [[0,3,3,3],[3,0,3,3],[3,3,0,3],[3,3,3,0]]
   @Test
   @Ignore
   public void permute2a() throws Exception {
      assertEquals(new ArrayList<>(), Permutations.permute(new int[]{3,3,0,3}));
   }

   @Test
   @Ignore
   public void permute2b() throws Exception {
      assertEquals(new ArrayList<>(), Permutations.permute(new int[]{2,0,0,1,1,3,3}));
   }


}
