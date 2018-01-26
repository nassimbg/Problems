import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GroupShiftedStringTest {

   @Test
   public void groupStrings() {
      String[] values = new String[] {"acd", "dfg", "wyz", "yab", "mop",
        "bdfh", "a", "x", "moqs"};

      List<List<String>> expectedResults = new ArrayList<>();
      expectedResults.add(Arrays.asList("a", "x"));
      expectedResults.add(Arrays.asList("bdfh", "moqs"));
      expectedResults.add(Arrays.asList("acd", "dfg", "wyz", "yab","mop"));

      assertEquals(expectedResults, GroupShiftedString.groupStrings(values));
   }
}