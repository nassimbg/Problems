import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfAStringCanBreakAnotherStringTest {

  @Test
  public void test1() {
    assertTrue(CheckIfAStringCanBreakAnotherString.checkIfCanBreak("abc", "xya"));
  }

  @Test
  public void test2() {
    assertFalse(CheckIfAStringCanBreakAnotherString.checkIfCanBreak("abe", "acd"));
  }

  @Test
  public void test3() {
    assertTrue(CheckIfAStringCanBreakAnotherString.checkIfCanBreak("leetcodee", "interview"));
  }
}
