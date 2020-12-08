import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfMatchingSubsequencesTest {

  @Test
  public void case1() {
    final int count = NumberOfMatchingSubsequences.numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"});

    assertEquals(3, count);
  }
}
