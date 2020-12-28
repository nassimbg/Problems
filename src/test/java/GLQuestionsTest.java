import org.junit.Test;

import static org.junit.Assert.*;

public class GLQuestionsTest {

  @Test
  public void Q1Test0() {
    final int solution = GLQuestions.BinomialFunction.solution(0, 0);

    assertEquals(1, solution);
  }

  @Test
  public void Q1Test1() {
    final int solution = GLQuestions.BinomialFunction.solution(5, 3);

    assertEquals(10, solution);
  }

  @Test
  public void Q1Test2() {
    final int solution = GLQuestions.BinomialFunction.solution(40, 20);

    assertEquals(-1, solution);
  }

  @Test
  public void Q1Test3() {
    final int solution = GLQuestions.BinomialFunction.solution(Integer.MAX_VALUE, 5);

    assertEquals(-1, solution);
  }

  @Test
  public void Q1Test4() {
    final int solution = GLQuestions.BinomialFunction.solution(3, 5);

    assertEquals(-1, solution);
  }






  @Test
  public void Q2Test1() {
    int[][] matrix = new int[][]{
        {5,4,4},
        {4,3,4},
        {3,2,4},
        {2,2,2},
        {3,3,4},
        {1,4,4},
        {4,1,1}
    };
    final int solution = GLQuestions.NumberOfIslands.solution(matrix);

    assertEquals(11, solution);
  }

  @Test
  public void Q2Test2() {
    int[][] matrix = new int[][]{
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {10,11,12},
        {13,14,15},
        {16,17,18},
        {19,20,21}
    };
    final int solution = GLQuestions.NumberOfIslands.solution(matrix);

    assertEquals(21, solution);
  }

  @Test
  public void Q2Test3() {
    int[][] matrix = new int[][]{
        {1,1,1},
        {1,1,1},
        {1,1,1}
    };
    final int solution = GLQuestions.NumberOfIslands.solution(matrix);

    assertEquals(1, solution);
  }

  @Test
  public void Q2Test4() {
    int[][] matrix = new int[][]{
        {1,-1,-1},
        {1,1,-1},
        {-1,-1,1}
    };
    final int solution = GLQuestions.NumberOfIslands.solution(matrix);

    assertEquals(4, solution);
  }







  @Test
  public void Q3Test0() {
    final int solution = GLQuestions.BinomialFunction.solution(0, 0);

    assertEquals(1, solution);
  }

}
