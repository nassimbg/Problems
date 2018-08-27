import java.util.StringJoiner;

public class LinkedList<T> {
   LinkedNode<T> head;
   LinkedNode<T> tail;
   int size;


   public void add(T value) {
      LinkedNode<T> node = new LinkedNode<>(value);

      if (head == null) {
         head = node;
      } else {
         tail.next = node;
         node.previous = tail;
      }

      //todo add size
      ++size;
      tail = node;
   }

   public void add(int index, T value) {
      if (size < index || index < 0) {
         throw new IllegalStateException();
      }
      if (index == size) {
         add(value);
      } else {

         LinkedNode<T> node = new LinkedNode<>(value);
         LinkedNode<T> current = getNode(index);

         node.next = current;
         node.previous = current.previous;
         current.previous = node;

         if (node.previous != null) {
            node.previous.next = node;
         } else {
            head = node;
         }

         size++;
      }
   }

   public T pollLast() {
      LinkedNode<T> current = tail;
      T value = current.value;
      current.next = null;
      current.value = null;

      tail = current.previous;
      current.previous = null;
      size--;

      return value;
   }

   public T remove(int index) {
      //todo check for corner cases
      if (size <= index || index > 0) {
         throw new IllegalStateException();
      }

      LinkedNode<T> node = getNode(index);

      if (node.next == null) {
         tail = node.previous;
      } else {
         node.next.previous = node.previous;
      }

      if (node.previous == null) {
         head = node.next;
      } else  {
         node.previous.next = node.next;
      }

      //todo always nullify
      T value = node.value;
      node.previous = null;
      node.next = null;
      node.value = null;
      size--;

      return value;
   }

   private LinkedNode<T> getNode(int index) {

      if (index == size - 1) {
         return tail;
      }
      int currentIndex = 0;
      LinkedNode<T> current = head;

      while (currentIndex != index) {
         ++currentIndex;
         current = current.next;
      }
      return current;
   }

   @Override
   public String toString() {
      StringJoiner stringJoiner = new StringJoiner("->");
      LinkedNode<T> current = head;

      while (current != null) {
         stringJoiner.add(current.value.toString());
         current = current.next;
      }

      return stringJoiner.toString();
   }

   private static final class LinkedNode<T> {
      private T value;
      private LinkedNode<T> next;
      private LinkedNode<T> previous;

      private LinkedNode(T value) {
         this.value = value;
      }

      @Override
      public String toString() {
         return value.toString();
      }
   }
}
