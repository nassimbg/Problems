import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {

   @Test
   public void test_when_value_is_a_positive_int_and_reverse_less_than_max() {
      int value = 12345678;

      assertEquals(87654321, ReverseInteger.reverse(value));
   }


   @Test
   public void test_when_value_is_a_negative_int_and_reverse_greater_than_min() {
      int value = -12345678;

      assertEquals(-87654321, ReverseInteger.reverse(value));
   }

   @Test
   public void test_when_value_is_a_positive_int_and_reverse_greater_than_max() {
      int value = 1534236469;

      assertEquals(0, ReverseInteger.reverse(value));
   }

   @Test
   public void test_when_value_is_a_negative_int_and_reverse_less_than_min() {
      long value = -2147483650L;

      assertEquals(0, ReverseInteger.reverse(value));
   }

   @Test
   public void test_wh22en_value_is_a_negative_int_and_reverse_greater_than_min_but_near() {
      long value = -1463847412L;

      assertEquals(-2147483641, ReverseInteger.reverse(value));
   }


}