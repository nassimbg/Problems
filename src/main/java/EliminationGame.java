import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EliminationGame {


   /**
    * I was trying to come up with a solution like this
    * @param n
    * @return
    */
   static int lastRemaining(int n) {
      int D = 1;
      int S = 1;
      boolean forward = true;
      while (n > 1) {
         if (forward) {
            S += D;
         } else {
            if ((n & 1) != 0) {
               S += D;
            }
         }
         n >>= 1;
         forward = !forward;
         D <<= 1;
      }
      return S;
   }

   /**
    * Recursive solution
    * @param n
    * @return
    */
   public int lastRemainingRecursive(int n) {
      return leftToRight(n);
   }

   private static int leftToRight(int n) {
      if(n <= 2) return n;
      return 2 * rightToLeft(n / 2);
   }

   private static int rightToLeft(int n) {
      if(n <= 2) return 1;
      if(n % 2 == 1) return 2 * leftToRight(n / 2);
      return 2 * leftToRight(n / 2) - 1;
   }



   /**
    * brute force solution
    * @param n
    * @return
    */
   public static int lastRemaining1(int n) {
      List<Integer> nubers = new ArrayList<>();

      for (int number = 1; number <= n; number++) {
         nubers.add(number);
      }

      ListIterator<Integer> listIterator = nubers.listIterator();



      boolean goingForward = true;
      int value = 0;
      while (listIterator.hasPrevious() || listIterator.hasNext()) {
         value = goingForward ? listIterator.next() : listIterator.previous();
         listIterator.remove();

         while (goingForward ? listIterator.hasNext() : listIterator.hasPrevious()) {
            int i = 0;
            for (; i < 2 && goingForward && listIterator.hasNext(); ++i) {

               value = listIterator.next();
            }

            for(; i < 2 && !goingForward && listIterator.hasPrevious(); ++i) {
               value = listIterator.previous();
            }

            if (i == 2) {
               listIterator.remove();
            }

         }
         goingForward = !goingForward;
      }

      return value;
   }
}
