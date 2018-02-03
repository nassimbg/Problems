public class CompareVersionNumbers {

   public static int compareVersion(String version1, String version2) {
      String[] versions1 = version1.split("\\.");
      String[] versions2 = version2.split("\\.");
      int maxLength = Math.max(version1.length(), version2.length());

      for (int index = 0; index < maxLength; index++) {
         int value1 = toInt(versions1, index);
         int value2 = toInt(versions2, index);

         if (value1 > value2) {
            return 1;
         }

         if (value2 > value1) {
            return -1;
         }
      }

      return 0;
   }

   private static int toInt( String[] versions1, int index) {
      return index < versions1.length ? Integer.parseInt(versions1[index]) : 0;
   }

   public static int compareVersion1(String version1, String version2) {
      int v1Index = 0;
      int v2Index = 0;

      StringBuilder st1 = new StringBuilder();
      StringBuilder st2 = new StringBuilder();
      while (v1Index < version1.length() || v2Index < version2.length()) {

         boolean c1Dot = v1Index >= version1.length() || version1.charAt(v1Index) == '.' ;
         boolean c2Dot = v2Index >= version2.length() || version2.charAt(v2Index) == '.' ;

         if (c1Dot && c2Dot) {
            int int1;
            if (v1Index <= version1.length()) {
               int1 = Integer.parseInt(st1.toString());
               st1 = new StringBuilder();
               ++v1Index;
            } else {
               int1 = 0;
            }

            int int2;
            if (v2Index <= version2.length()) {
               int2 = Integer.parseInt(st2.toString());
               st2 = new StringBuilder();
               ++v2Index;
            } else {
               int2 = 0;
            }

            if (int1 != int2) {
               return int1 > int2 ? 1 : -1;
            }
         }

         if (!c2Dot) {
            st2.append( version2.charAt(v2Index));
            ++v2Index;
         }

         if (!c1Dot) {
            st1.append( version1.charAt(v1Index));
            ++v1Index;
         }
      }

      int int1 = st1.length() > 0 ?  Integer.parseInt(st1.toString()) : 0;
      int int2 = st2.length() > 0 ? Integer.parseInt(st2.toString()) : 0;

      if (int1 == int2) {
         return 0;
      }

      return int1 > int2 ? 1 : -1;
   }
}
