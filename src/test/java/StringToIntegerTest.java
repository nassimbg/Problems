import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringToIntegerTest {

   @Test
   public void test_positive_int() {
      String str = "21344hghjt";

      assertEquals(21344, StringToInteger.atoi(str));
   }

   @Test
   public void test_signed_positive_int() {
      String str = "+21344hghjt";

      assertEquals(21344, StringToInteger.atoi(str));
   }

   @Test
   public void test_signed_negative_int() {
      String str = "-21344hghjt";

      assertEquals(-21344, StringToInteger.atoi(str));
   }

   @Test
   public void test_positive_int_starting_with_spaces() {
      String str = "     21344hghjt";

      assertEquals(21344, StringToInteger.atoi(str));
   }

   @Test
   public void test_positive_int_starting_with_chars() {
      String str = "jsksk21344hghjt";

      assertEquals(0, StringToInteger.atoi(str));
   }

   @Test
   public void test_int_having_char_in_middle() {
      String str = "2wdd1344hghjt";
      assertEquals(2, StringToInteger.atoi(str));
   }

   @Test
   public void test_positive_int_greater_than_max() {
      String str = "2147483650hghjt";

      assertEquals(Integer.MAX_VALUE, StringToInteger.atoi(str));
   }

   @Test
   public void test_positive_int_greater_than_one_of_max() {
      String str = "2147483648";

      assertEquals(Integer.MAX_VALUE, StringToInteger.atoi(str));
   }

   @Test
   public void test_positive_int_less_than_min() {
      String str = "-2147483650hghjt";

      assertEquals(Integer.MIN_VALUE, StringToInteger.atoi(str));
   }

   @Test
   public void test_invalid_value_with_two_signs() {
      String str = "+-2";

      assertEquals(0, StringToInteger.atoi(str));
   }

}