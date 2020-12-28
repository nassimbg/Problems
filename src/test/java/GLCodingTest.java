import org.junit.Test;

import static org.junit.Assert.*;

public class GLCodingTest {

  @Test
  public void test1() {
    assertTrue(GLCoding.questionOne("()"));
  }


  @Test
  public void tes2() {
    assertTrue(GLCoding.questionOne("()[]{}"));
  }


  @Test
  public void test3() {
    assertFalse(GLCoding.questionOne("(]"));
  }

  @Test
  public void test4() {
    assertFalse(GLCoding.questionOne(")("));
  }

  @Test
  public void test5() {
    assertFalse(GLCoding.questionOne("([)]"));
  }

  @Test
  public void test6() {
    assertTrue(GLCoding.questionOne("{[]}"));
  }

  @Test
  public void test7() {
    assertFalse(GLCoding.questionOne(")"));
  }

  @Test
  public void test8() {
    assertFalse(GLCoding.questionOne("([]"));
  }

  @Test
  public void test9() {
    assertFalse(GLCoding.questionOne("{"));
  }

  @Test
  public void test10() {
    assertFalse(GLCoding.questionOne("([)])"));
  }

  @Test
  public void test11() {
    assertTrue(GLCoding.questionOne(""));
  }




  @Test
  public void test12() {
    assertFalse(GLCoding.questionOne("[[[[[[[[[[["));
  }


}
