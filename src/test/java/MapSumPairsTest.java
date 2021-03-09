import org.junit.Test;

import static org.junit.Assert.*;

public class MapSumPairsTest {


  @Test
  public void test1() {
    MapSumPairs.MapSum m = new MapSumPairs.MapSum();
    m.insert("apple", 3);

    assertEquals(3, m.sum("ap"));
    m.insert("app", 2);
    assertEquals(5, m.sum("ap"));
  }
}
