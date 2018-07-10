import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class EvaluateDivisionTest {

   @Test
   public void calcEquation() {
      String[][] equations = new String[][]{ {"a", "b"}, {"b", "c"} };
      double[] values = new double[]{2.0, 3.0};
      String[][] queries = new String[][]{{"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"} };
      assertArrayEquals(new double[] { 6.0, 0.5, -1.0, 1.0, -1.0 }, EvaluateDivision.calcEquation(equations, values, queries), 0.1);
   }
}