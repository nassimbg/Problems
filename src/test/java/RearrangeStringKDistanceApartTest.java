import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RearrangeStringKDistanceApartTest {

   @Test
   public void solution() {
      assertEquals("acbacb", RearrangeStringKDistanceApart.solution("aabbcc", 3));
   }

   @Test
   public void solution2() {
      assertEquals("bcabcab", RearrangeStringKDistanceApart.solution("aabbbcc", 3));
   }
}