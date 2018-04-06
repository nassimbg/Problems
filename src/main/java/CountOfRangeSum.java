public class CountOfRangeSum {
   public static int countRangeSum(int[] nums, int lower, int upper) {

      int result = 0;
      AVLTree avlTree = new AVLTree();
      long sum = 0;
      for (int num : nums) {
         sum += num;

         if (sum >= lower && sum <= upper) {
            ++result;
         }

         long lowerBound = sum - lower;
         long higherBound = sum - upper;

         if (lowerBound > higherBound) {
            long temp = higherBound;
            higherBound = lowerBound;
            lowerBound = temp;
         }

         result += avlTree.rank(higherBound) - avlTree.rank(lowerBound - 1);
         avlTree.insert(sum);

      }

      return  result;
   }

   private static final class AVLTree {
      private AVLNode root;

      void insert(long value) {
         AVLNode current = root;
         AVLNode parent = root;

         while (current != null) {
            if (current.value < value) {
               parent = current;
               current = current.right;
            } else if (current.value > value) {
               parent = current;
               current = current.left;
            } else if (current.value == value) {
               ++current.size;
               return;
            }
            ++parent.size;
         }

         AVLNode node = new AVLNode(value);
         if (parent != null) {
            if (parent.value < value) {
               parent.right = node;
            } else {
               parent.left = node;
            }
         } else {
            root = node;
         }

      }

      int rank(long value) {
         AVLNode current = root;

         int rank = 0;

         while (current != null) {

            if (current.value > value) {
               current = current.left;
            } else if (current.value <= value) {
               AVLNode right = current.right;
               rank += current.size - (right != null ? right.size : 0);

               if (current.value == value) {
                  break;
               } else {
                  current = current.right;
               }
            }
         }
         return rank;
      }
   }

   private static class AVLNode {
      long value;
      int size = 1;
      AVLNode left;
      AVLNode right;

      AVLNode(long value) {
         this.value = value;
      }
   }
}
