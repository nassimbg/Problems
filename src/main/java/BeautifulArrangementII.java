public class BeautifulArrangementII {
   public static int[] constructArray(int n, int k) {
      int[] result = new int[n];

      int start = 1;
      int end = n;
      int index = 0;
      int mutableK = k;
      while (mutableK > 1) {
         if (index > 0 && result[index - 1] > start + 1) {
            mutableK--;
         }
         result[index++] = start++;
         if (mutableK > 1) {
            result[index++] = end--;
            mutableK--;
         }
      }

      if (k % 2 == 0) {
         for (int i = end; i >= start; i--) {
            result[index++] = i;
         }
      } else {
         for (int i = start; i <= end; i++) {
            result[index++] = i;
         }
      }

      return result;
   }
}

// 3 distinct
// start end start start+1 start+2 start+3 start+4

// 4
// start end start end end-1 end-2 end-3