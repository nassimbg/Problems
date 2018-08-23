import java.util.Comparator;
import java.util.Random;

public class QuickSort {



   public static <T> T quickSelect(T[] array, Comparator<T> t, int indexToFind) {
      Random random = new Random();
      return quickSelect(random, array, t, 0, array.length - 1, indexToFind);
   }

   private static <T> T quickSelect(Random rand, T[] array, Comparator<T> t, int start, int end, int rank) {
      //todo pay attention to conditions
      if (start <= end && rank <= end - start + 1 && rank > 0) {

         int pivot = partition2(rand, array, t, start, end);

         //todo use relative rank of pivot wrt start
         int relativePivotRank = pivot - start + 1;

         if (rank == relativePivotRank) {
            return array[pivot];
         }

         if (relativePivotRank < rank) {
            //todo remove relativePivotRank from the rank
            return quickSelect(rand, array, t, pivot + 1, end, rank - relativePivotRank);
         }

         return quickSelect(rand, array, t, start, pivot - 1, rank);
      }

      return null;
   }

   public static <T> void sort(T[] array, Comparator<T> t) {
      Random random = new Random();
      quickSort(random, array, t, 0, array.length - 1);
   }

   private static <T> void quickSort(Random rand, T[] array, Comparator<T> t, int start, int end) {

      //todo always remember corner conditions
      if (start < end) {
         int pivot = partition2(rand, array, t, start, end);

         //todo dont take pivot in the recursive calls
         quickSort(rand, array, t, start, pivot - 1);
         quickSort(rand, array, t, pivot + 1, end);
      }
   }


   /**    This function takes random element as pivot, places
    the pivot element at its correct position in sorted
    array, and places all smaller (smaller than pivot)
    to left of pivot and all greater elements to right
    of pivot*/
   private static <T> int partition(Random rand, T[] array, Comparator<T> t, int start, int end) {
      int pivot = rand.nextInt((end + 1) - start) + start;
      T pivotValue = array[pivot];
      //todo swap pivot with last index in order not to take it in consideration
      swap(array, pivot, end);

      //todo index of smaller element
      int slow = start - 1;

      for (int fast = start; fast < end; fast++) {

         // If current element is smaller than or
         // equal to pivot
         if (t.compare(array[fast], pivotValue) <= 0) {
            ++slow;

            swap(array, fast, slow);
         }
      }

      //todo at the end swap pivot with left since now left is the last > right => its value is > pivotValue
      ++slow;
      swap(array, end, slow);
      return slow;
   }

   private static void swap(Object[] arr, int first, int second) {
      Object tempVal = arr[first];
      arr[first] = arr[second];
      arr[second] = tempVal;
   }

/**    This function takes random element as pivot, places
   the pivot element at its correct position in sorted
    array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right
   of pivot*/
   private static <T> int partition2(Random rand, T[] array, Comparator<T> t, int start, int end) {
      int pivot = rand.nextInt((end + 1) - start) + start;
      T pivotValue = array[pivot];
      //todo swap pivot with last index in order not to take it in consideration
      swap(array, pivot, end);

      int left = start;
      int right = end - 1;

      //todo should be equal
      while (left <= right) {
         boolean isLeftSmallerOrEqualToPivot = t.compare(array[left], pivotValue) <= 0;
         boolean isRightGreaterThanPivot = t.compare(array[right], pivotValue) > 0;

         if (!isLeftSmallerOrEqualToPivot && !isRightGreaterThanPivot) {
            swap(array, left, right);
         } else {
            if (isLeftSmallerOrEqualToPivot) {
               ++left;
            }

            if (isRightGreaterThanPivot) {
               --right;
            }
         }
      }

      //todo at the end swap pivot with left since now left is the last > right => its value is > pivotValue
      swap(array, end, left);
      return left;
   }
}
