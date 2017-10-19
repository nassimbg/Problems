import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimplifyPathTest {
   @Test
   public void simplifyPath() throws Exception {
      assertEquals("/home", SimplifyPath.simplifyPath("/home/"));
   }

   @Test
   public void simplifyPath1() throws Exception {
      assertEquals("/c", SimplifyPath.simplifyPath("/a/./b/../../c/"));
   }

   @Test
   public void simplifyPath2() throws Exception {
      assertEquals("/", SimplifyPath.simplifyPath("/../"));
   }

   @Test
   public void simplifyPath3() throws Exception {
      assertEquals("/home/foo", SimplifyPath.simplifyPath("/home//foo/"));
   }

   @Test
   public void simplifyPath4() throws Exception {
      assertEquals("/...", SimplifyPath.simplifyPath("/..."));
   }

}