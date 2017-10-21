import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WordSearchTest {
   @Test
   public void exist() throws Exception {

      char[][] matrix = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

      assertTrue(WordSearch.exist(matrix, "ABCCED"));
   }


   @Test
   public void exist2() throws Exception {

      char[][] matrix = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

      assertTrue(WordSearch.exist(matrix, "SEE"));
   }

   @Test
   public void exist3() throws Exception {

      char[][] matrix = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

      assertFalse(WordSearch.exist(matrix, "ABCB"));
   }

   @Test
   public void exist4() throws Exception {

      char[][] matrix = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

      assertFalse(WordSearch.exist(matrix, ""));
   }

}