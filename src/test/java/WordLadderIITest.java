import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class WordLadderIITest {
   @Test
   public void findLadders() throws Exception {
      String begin = "hit";
      String end = "cog";
      List<String> words = Arrays.asList("hot","dot","dog","lot","log","cog");

      WordLadderII.findLadders(begin, end, words);
   }


   @Test
   public void findLadders1() throws Exception {
      String begin = "hit";
      String end = "cog";
      List<String> words = Arrays.asList("hot","dot","dog","lot","log");

      WordLadderII.findLadders(begin, end, words);
   }


   @Test
   public void findLadders2() throws Exception {
      String begin = "a";
      String end = "c";
      List<String> words = Arrays.asList("a" ,"b", "c");

      WordLadderII.findLadders(begin, end, words);
   }



}