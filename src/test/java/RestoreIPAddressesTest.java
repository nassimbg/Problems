import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class RestoreIPAddressesTest {
   @Test
   public void restoreIpAddresses() throws Exception {
      assertEquals(Arrays.asList("255.255.111.35", "255.255.11.135"), RestoreIPAddresses.restoreIpAddresses("25525511135"));
   }

   @Test
   public void restoreIpAddresses2() throws Exception {
      assertEquals(Arrays.asList("0.0.0.0"), RestoreIPAddresses.restoreIpAddresses("0000"));
   }

   @Test
   public void restoreIpAddresses3() throws Exception {
      assertEquals(Arrays.asList("0.10.0.10","0.100.1.0"), RestoreIPAddresses.restoreIpAddresses("010010"));
   }

   @Test
   public void restoreIpAddresses4() throws Exception {
      assertEquals(Arrays.asList("1.0.102.3", "10.1.0.23", "1.0.10.23", "101.0.2.3", "10.10.2.3"), RestoreIPAddresses.restoreIpAddresses("101023"));
   }

   @Test
   public void restoreIpAddresses5() throws Exception {
      assertEquals(Arrays.asList("17.216.254.1", "172.16.254.1", "172.162.5.41", "17.216.25.41", "172.16.25.41", "172.162.54.1"), RestoreIPAddresses.restoreIpAddresses("172162541"));
   }

   @Test
   public void restoreIpAddresses6() throws Exception {
      assertEquals(new ArrayList<>(), RestoreIPAddresses.restoreIpAddresses(""));
   }

   @Test
   public void restoreIpAddresses7() throws Exception {
      assertEquals(Arrays.asList("7.74.0.94", "77.4.0.94", "7.7.40.94", "77.40.9.4"), RestoreIPAddresses.restoreIpAddresses("00000"));
   }

   @Test
   public void restoreIpAddresses8() throws Exception {
      assertEquals(new ArrayList<>(), RestoreIPAddresses.restoreIpAddresses("000256"));
   }
   @Test
   public void restoreIpAddresses9() throws Exception {
      assertEquals(new ArrayList<>(), RestoreIPAddresses.restoreIpAddresses("774094"));
   }

}