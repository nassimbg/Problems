import java.util.Arrays;
import java.util.Comparator;

public class Heap<T> {

   private T[] arr;
   private int size;
   private final Comparator<T> comparator;

   Heap(T[] arr, Comparator<T> comparator) {
      this.arr = Arrays.copyOf(arr, arr.length);
      this.comparator = comparator;
      this.size = arr.length;

      for(int index = size/2; index >= 0; --index) {
         heapifyDown(index);
      }
   }

   private void heapifyDown(int index) {
      while (index < size) {
         int leftChild = 2*index + 1;
         int rightChild = 2*index + 2;

         int minIndex = getMinIndexDown(index, leftChild);
         minIndex = getMinIndexDown(minIndex, rightChild);

         if(minIndex == index) {
            return;
         }

         swap(arr, index, minIndex);
         index = minIndex;
      }
   }

   public T poll() {
      if (size == 0) {
         return null;
      }

      T firstElement = arr[0];
      arr[0] = arr[--size];

      arr[size] = null;

      heapifyDown(0);

      return firstElement;
   }

   public void add(T value) {
      if (size == arr.length) {
         arr = Arrays.copyOf(arr, 2*arr.length);
      }

      arr[size++] = value;

      heapifyUp(size - 1);


   }

   private void heapifyUp(int index) {
      while (index > 0) {
         int parentIndex = (index - 1)/2;

         int minIndex = getMinIndexUp(parentIndex, index);

         if (minIndex == index) {
            return;
         }
         swap(arr, index, parentIndex);
         index = parentIndex;
      }
   }

   public void remove(T value) {
      for (int i = 0; i < size; i++) {
         if (value.equals(arr[i])) {
            int currentIndex = i;
            while(currentIndex > 0) {

               int parentIndex = (currentIndex - 1)/2;
               swap(arr, parentIndex, currentIndex);
               currentIndex = parentIndex;
            }
            poll();
            return;
         }
      }
   }

   private int getMinIndexUp(int index, int leftChild) {
      return leftChild >= 0 && leftChild < size && comparator.compare(arr[index], arr[leftChild]) > 0 ? index : leftChild;
   }
   private int getMinIndexDown(int index, int leftChild) {
      return leftChild >= 0 && leftChild < size && comparator.compare(arr[index], arr[leftChild]) > 0 ? leftChild : index;
   }

   private static void swap(Object[] arr, int index1, int index2) {
      Object temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
   }
}
