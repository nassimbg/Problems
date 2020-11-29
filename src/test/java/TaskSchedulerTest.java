import org.junit.Test;

import static org.junit.Assert.*;

public class TaskSchedulerTest {

  @Test
  public void test1() {
    final int interval = TaskScheduler.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2);

    assertEquals(8 ,interval);
  }

  @Test
  public void test2() {
    final int interval = TaskScheduler.leastInterval(new char[]{'A','A','A','B','B','B'}, 0);

    assertEquals(6 ,interval);
  }

  @Test
  public void test3() {
    final int interval = TaskScheduler.leastInterval(new char[]{'A','A','A','A','A','A','B','C','D','E','F','G'}, 2);

    assertEquals(16 ,interval);
  }

}
