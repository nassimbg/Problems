import static org.junit.Assert.*;

import org.junit.Test;

public class StudentAttendanceRecordITest {

   @Test
   public void checkRecord() {
      boolean reward = StudentAttendanceRecordI.checkRecord("PPALLP");
      assertTrue(reward);
   }

   @Test
   public void checkRecord2() {
      boolean reward = StudentAttendanceRecordI.checkRecord("PPALLL");
      assertFalse(reward);
   }
}