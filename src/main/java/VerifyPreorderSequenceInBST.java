import java.util.ArrayDeque;
import java.util.Deque;

public class VerifyPreorderSequenceInBST {

   // this solution is not done refactoring from the below correct solution
/*   public static boolean verifyPreorder(int[] preorder) {

      int currentIndex = 0;
      int index = 0;
      int min = Integer.MIN_VALUE;
      boolean flag = true;

      while((currentIndex>=0 && currentIndex < preorder.length)) {
         while(true) {
            ++index;
            if (currentIndex < preorder.length - 1 && min < preorder[currentIndex + 1] && preorder[currentIndex] > preorder[currentIndex + 1]) {
               currentIndex++;
            } else {
               break;
            }
         }

         while(currentIndex > 0 && !(index < preorder.length - 1 && (preorder[currentIndex] < preorder[index] || (preorder[currentIndex - 1] > preorder[index] )))) {
            --currentIndex;
         }
         min = preorder[currentIndex];
         currentIndex = index;

      }


      return index == preorder.length;
   }*/

// this is the correct solution that i have with O(n) time and O(1) space
   public static boolean verifyPreorder(int[] preorder) {

      int currentIndex = 0;
      int index = 0;
      int min = Integer.MIN_VALUE;
      boolean flag = true;

      while((currentIndex>=0 && currentIndex < preorder.length) || flag) {
         while(flag) {

            if (currentIndex < preorder.length - 1 && min < preorder[currentIndex + 1] && preorder[currentIndex] > preorder[currentIndex + 1]) {
               currentIndex++;
               flag = true;
            } else {
               flag = false;
            }
            ++index;
         }

         min = preorder[currentIndex];
         if (index < preorder.length - 1 && (preorder[currentIndex] < preorder[index] || (preorder[currentIndex - 1] > preorder[index] ))) {
            currentIndex = index;
            flag = true;
         } else {
            flag = false;
            --currentIndex;
         }

      }


      return index == preorder.length;
   }

   public static boolean verifyPreorder2(int[] preorder) {
      Deque<Integer> stack = new ArrayDeque<>();

      int currentIndex = 0;
      int index = 0;
      int min = Integer.MIN_VALUE;

      while(!stack.isEmpty() || currentIndex!=-1) {
         while(currentIndex != -1) {
            stack.add(currentIndex);

            if (currentIndex < preorder.length - 1 && min < preorder[currentIndex + 1] && preorder[currentIndex] > preorder[currentIndex + 1]) {
               currentIndex++;
            } else {
               currentIndex = -1;
            }
            ++index;
         }

         Integer parentIndex = stack.pollLast();
         min = preorder[parentIndex];
         if (index < preorder.length - 1&& (preorder[parentIndex] < preorder[index] || (!stack.isEmpty() && preorder[stack.peekLast()] > preorder[index] ))) {
            currentIndex = index;
         } else {
            currentIndex = -1;
         }

      }


      return index == preorder.length;
   }
}
