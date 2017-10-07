import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GroupAnagramsTest {
   @Test
   public void groupAnagrams() throws Exception {

      ArrayList<Object> expected = new ArrayList<>();
      expected.add(Arrays.asList("ate", "eat","tea"));
      expected.add(Arrays.asList("nat","tan"));
      expected.add(Arrays.asList("bat"));
      assertEquals(expected, GroupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
   }

   @Test
   public void groupAnagrams2() throws Exception {


      //todo due to boo
      String[] strs = {
        "hos","boo","nay","deb","wow","bop","bob","brr","hey","rye","eve","elf",
        "pup","bum","iva","lyx","yap","ugh","hem","rod","aha","nam","gap","yea",
        "doc","pen","job","dis","max","oho","jed","lye","ram","pup","qua","ugh",
        "mir","nap","deb","hog","let","gym","bye","lon","aft","eel","sol","jab"};
   }

}