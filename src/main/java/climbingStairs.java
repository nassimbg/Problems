public class climbingStairs {

   public static int climbStairs(int n) {
      int first = 0;
      int second = 1;
      for(int index = n - 1; index >= 0; --index) {
         int t = first + second;
         second = first;
         first = t;
      }

      return first + second;
   }
}
