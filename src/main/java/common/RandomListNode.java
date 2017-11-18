package common;

public class RandomListNode {
   public int label;
   public RandomListNode next, random;

   public RandomListNode(int x) {
      this.label = x;
   }

   @Override
   public String toString() {
      return "" + label;
   }
}
