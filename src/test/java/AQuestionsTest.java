import org.junit.Test;

import static org.junit.Assert.*;

public class AQuestionsTest {

  @Test
  public void question1Test1() {
    final int result = AQuestions.solution1(new int[]{4, 5, 7, 6, 3, 2});

    assertEquals(6, result);
  }

  @Test
  public void question1Test2() {
    final int result = AQuestions.solution1(new int[]{2});

    assertEquals(1, result);
  }

  @Test
  public void question1Test3() {
    final int result = AQuestions.solution1(new int[]{1, 2});

    assertEquals(2, result);
  }

  @Test
  public void question1Test4() {
    final int result = AQuestions.solution1(new int[]{2,5,3,2,4,1});

    assertEquals(6, result);
  }

  @Test
  public void question1Test5() {
    final int result = AQuestions.solution1(new int[]{2,3,3,2,2,2,1});

    assertEquals(4, result);
  }

  @Test
  public void question2Test1() {
    final int result = AQuestions.solution2(new int[]{1,2,3}, new int[]{0,0,0});

    assertEquals(0, result);
  }

  @Test
  public void question2Test2() {
    final int result = AQuestions.solution2(new int[]{0,1,2,4,5}, new int[]{2,3,3,3,2});

    assertEquals(3, result);
  }

  @Test
  public void question2Test3() {
    final int result = AQuestions.solution2(new int[]{2,3,3,4}, new int[]{1,1,0,0});

    assertEquals(-1, result);
  }
}
