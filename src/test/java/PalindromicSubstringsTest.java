import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromicSubstringsTest {

  @Test
  public void test1() {
    assertEquals(3, PalindromicSubstrings.countSubstrings("abc"));
  }

  @Test
  public void test2() {
    assertEquals(6, PalindromicSubstrings.countSubstrings("aaa"));
  }

}
