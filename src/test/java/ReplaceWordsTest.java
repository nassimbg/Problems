import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReplaceWordsTest {

  @Test
  public void test1() {
    final String output = ReplaceWords.replaceWords(Arrays.asList("cat", "bat", "rat"),
        "the cattle was rattled by the battery");

    assertEquals("the cat was rat by the bat", output);
  }

  @Test
  public void test2() {
    final String output = ReplaceWords.replaceWords(Arrays.asList("a","b","c"),
        "aadsfasf absbs bbab cadsfafs");

    assertEquals("a a b c", output);
  }

  @Test
  public void test3() {
    final String output = ReplaceWords.replaceWords(Arrays.asList("a", "aa", "aaa", "aaaa"),
        "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa");

    assertEquals("a a a a a a a a bbb baba a", output);
  }

  @Test
  public void test4() {
    final String output = ReplaceWords.replaceWords(Arrays.asList("catt","cat","bat","rat"),
        "the cattle was rattled by the battery");

    assertEquals("the cat was rat by the bat", output);
  }

  @Test
  public void test5() {
    final String output = ReplaceWords.replaceWords(Arrays.asList("ac","ab"),
        "it is abnormal that this solution is accepted");

    assertEquals("it is ab that this solution is ac", output);
  }
}
