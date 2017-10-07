import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PermutationsTest {
   @Test
   public void permute1() throws Exception {
      assertEquals(new ArrayList<>(), Permutations.permute(new int[]{1,2,3}));
   }

   @Test
   public void permute2() throws Exception {
      assertEquals(new ArrayList<>(), Permutations.permute(new int[]{1,1, 2}));
   }

//   [[0,3,3,3],[3,0,3,3],[3,3,0,3],[3,3,3,0]]
   @Test
   public void permute2a() throws Exception {
      assertEquals(new ArrayList<>(), Permutations.permute(new int[]{3,3,0,3}));
   }

   @Test
   public void permute2b() throws Exception {
      assertEquals(new ArrayList<>(), Permutations.permute(new int[]{2,0,0,1,1,3,3}));
   }


}