import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class LetterCombinationsOfAPhoneNumberTest {
   @Test
   public void letterCombinations() throws Exception {

      assertEquals(Arrays.asList("ad", "bd", "cd", "ae", "be", "ce", "af", "bf", "cf"), LetterCombinationsOfAPhoneNumber.letterCombinations("23"));
   }

}