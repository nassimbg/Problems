public class BeautifulArrangement {
   public static int countArrangement(int N) {
      return countDFS(N, new boolean[N + 1], 0);
   }

   private static int countDFS(int N, boolean[] taken, int numberOfValuesTaken) {
      if (numberOfValuesTaken == N) {
         return 1;
      }


      int count = 0;
      numberOfValuesTaken++;
      for (int val = 1; val <= N; val++) {
         if (!taken[val] && ((numberOfValuesTaken % val) == 0 || (val % numberOfValuesTaken) == 0)) {
            taken[val] = true;
            count += countDFS(N, taken, numberOfValuesTaken);
            taken[val] = false;
         }
      }

      return count;
   }
}
