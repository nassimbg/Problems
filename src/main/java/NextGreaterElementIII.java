import java.util.Arrays;

public class NextGreaterElementIII {

   /**
    * if we have 124653 => next greater is 125346
    * How to reach this number
    * 1- start iterating from right till left until we reach a digit where num[i] < num[i + 1]
    * 2- find the smallest greater value from num[i] in the range num[i+1....num.length[ assume its on index t
    * 3- swap(num, i, t)
    * 4 sort(num, i + 1, num.length) in asc order
    */
   public static int nextGreaterElement(int n) {
      if (n == 0) {
         return 0;
      }

      char[] s = Integer.toString(n).toCharArray();

      int index = s.length - 2;
      for (; index >= 0 && s[index] >= s[index + 1]; index--) {
      }

      if (index < 0) {
         return -1;
      }

      // find first char greater than s[index] and swap their places
      int indexToSwapWith = index;
      for (int i = index + 1; i < s.length; i++) {
         if (s[i] <= s[index]) {
            break;
         }
         indexToSwapWith = i;
      }

      char temp = s[index];
      s[index] = s[indexToSwapWith];
      s[indexToSwapWith] = temp;

      // sort indexes in asc order from index + 1 till the end
      Arrays.sort(s, index + 1, s.length);

      Long val = Long.valueOf(new String(s));

      return val > Integer.MAX_VALUE ? -1 : val.intValue();

   }
}
