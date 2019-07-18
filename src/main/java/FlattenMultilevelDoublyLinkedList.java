public class FlattenMultilevelDoublyLinkedList {


   public Node flatten(Node head) {
      flattenRec(head);

      return head;
   }

   public Node flattenRec(Node head) {

      Node current = head;
      Node parent = head;

      while (current != null) {

         if (current.child != null) {

            Node lastInChild = flattenRec(current.child);

            Node next = current.next;
            lastInChild.next = next;

            if (next != null) {
               next.prev = lastInChild;
            }
            current.next = current.child;
            current.next.prev = current;

            current.child = null;
            current = lastInChild;
         }

         parent = current;
         current = current.next;
      }

      return parent;
   }

   public Node flatten2(Node head) {
      return flattenRec2(head)[0];
   }

   public Node[] flattenRec2(Node head) {
      Node dummy = new Node();
      Node currentNode = dummy;

      while(head != null) {
         head.prev = currentNode;

         currentNode.next = head;
         currentNode = head;
         head = head.next;
         if (currentNode.child != null) {
            Node[] Flattened = flattenRec2(currentNode.child);
            currentNode.child = null;
            currentNode.next = Flattened[0];

            Flattened[0].prev = currentNode;
            currentNode = Flattened[1];
         }
      }



      Node headList = dummy.next;

      if (headList != null) {
         headList.prev = null;
      }

      return new Node[]{headList, currentNode};
   }

   class Node {
      public int val;
      public Node prev;
      public Node next;
      public Node child;

      public Node() {
      }

      public Node(int _val, Node _prev, Node _next, Node _child) {
         val = _val;
         prev = _prev;
         next = _next;
         child = _child;
      }
   }
}
