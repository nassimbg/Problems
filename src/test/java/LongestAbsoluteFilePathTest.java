import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestAbsoluteFilePathTest {

   @Test
   public void lengthLongestPath() {
      assertEquals(32, LongestAbsoluteFilePath.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
   }

   @Test
   public void lengthLongestPath2() {
      assertEquals(0, LongestAbsoluteFilePath.lengthLongestPath(""));
   }


   @Test
   public void lengthLongestPath3() {
      assertEquals(20, LongestAbsoluteFilePath.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
   }

   @Test
   public void lengthLongestPath4() {
      assertEquals(19, LongestAbsoluteFilePath.lengthLongestPath("dir\n\t       file.ext"));
   }

}