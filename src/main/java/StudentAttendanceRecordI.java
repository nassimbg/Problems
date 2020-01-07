public class StudentAttendanceRecordI {
   public static boolean checkRecord(String s) {
      int count = s.length();

      int contL = 0;
      int abs = 0;
      for (int session = 0; session < count; session++) {
         char currentStatus = s.charAt(session);

         if (currentStatus == 'L') {
            contL++;

            if (contL > 2) {
               return false;
            }
         } else {
            contL = 0;
            if (currentStatus == 'A') {
               abs++;

               if (abs > 1) {
                  return false;
               }
            }
         }
      }

      return true;
   }
}
