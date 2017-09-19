public class ReverseNodesInKGroup {

   public static ListNode reverseKGroup2(ListNode head, int k) {
     ListNode endRef = null;
     ListNode firstRef = head;
     ListNode ref = null;
     ListNode dummyHead = null;

     while (true) {

        if (firstRef == null) {
           return dummyHead;
        }
        endRef = firstRef;
        int counter = 1;

        while (counter < k && endRef.next != null) {
           ++counter;
           endRef = endRef.next;
        }

        if (dummyHead == null) {
           dummyHead = counter < k ? head : endRef;
        }

        if (counter < k) {
           return dummyHead;
        }

        if (ref != null) {
           ref.next = endRef;
        }

        ref = endRef;

        //to point to the first ref that will become the last when reversed
        endRef = firstRef;

        while (firstRef != ref) {
           ListNode temp = ref.next;
           ref.next = firstRef;
           firstRef = firstRef.next;
           ref.next.next = temp;
        }

        //to ensure that a parent pointer will point to the last value in the new k
        ref = endRef;
        firstRef = endRef.next;
     }
   }


   public static ListNode reverseKGroup(ListNode head, int k) {
      ListNode endRef = null;
      ListNode firstRef = head;
      ListNode dummyHead = new ListNode(0);
      dummyHead.next = head;
      ListNode ref = dummyHead;

      while (firstRef != null) {
         endRef = firstRef;

         int counter = 1;
         while (counter < k && endRef.next != null) {
            ++counter;
            endRef = endRef.next;
         }

         if (counter < k) {
            break;
         }

         ref.next = endRef;
         ref = endRef;

         //to point to the first ref that will become the last when reversed
         endRef = firstRef;

         while (firstRef != ref) {
            ListNode temp = ref.next;
            ref.next = firstRef;
            firstRef = firstRef.next;
            ref.next.next = temp;
         }

         //to ensure that a parent pointer will point to the last value in the new k
         ref = endRef;
         firstRef = endRef.next;
      }

      return dummyHead.next;
   }


   public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
   }
}
