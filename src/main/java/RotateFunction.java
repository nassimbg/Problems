public class RotateFunction {

   /**
    * aft
    * @param A
    * @return
    */
   public static int maxRotateFunction(int[] A) {
      if (A.length == 0) {
         return 0;
      }

      int sumOfK0 = 0;
      int cummulativeOfValues = 0;
      for (int i = 0; i < A.length; i++) {
         sumOfK0 += (i * A[i]);
         cummulativeOfValues += A[i];
      }

      int max = sumOfK0;
      int summationStartingFromEnd = 0;
      for(int k = 1 ; k < A.length; k++) {
         summationStartingFromEnd += (A.length * A[A.length - k]);
         max = Math.max(max, sumOfK0 + (k * cummulativeOfValues) - summationStartingFromEnd);
      }

      return max;
   }

   /**
    * MAX(SUM(((K + i) % n) * A[i]))
    *  => SUM(((K + i) % n) * A[i])
    *  = SUM((K + i) * A[i])     IF K+i < n
    *    SUM((K + i - n) * A[i]) IF K+i >=n
    * .....
    * @param A
    * @return
    */

   public int maxRotateFunctionBruteForce(int[] A) {

      if (A.length == 0) {
         return 0;
      }
      int max = Integer.MIN_VALUE;

      for (int k = 0; k < A.length; k++) {
         int sum = 0;
         for (int i = 0; i < A.length; i++) {
            sum += (((k + i)% A.length) * A[i]);
         }
         max = Math.max(max, sum);
      }

      return max;
   }
}
