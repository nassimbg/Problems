import java.util.Objects;

public class QuadTreeIntersection {
   public static Node intersect(Node quadTree1, Node quadTree2) {
      // check if one is a leaf

      boolean quadOneIsLeaf = quadTree1.isLeaf;
      boolean quadTwoIsLeaf = quadTree2.isLeaf;

      if (quadOneIsLeaf || quadTwoIsLeaf) {
         if (quadOneIsLeaf) {
            if (quadTree1.val) {
               return quadTree1;
            }
         }

         if (quadTwoIsLeaf){
            if (quadTree2.val) {
               return quadTree2;
            }
         }

         return quadOneIsLeaf ? quadTree2 : quadTree1;
      }

      //assume that both are not leaf
      Node topLeft = intersect(quadTree1.topLeft, quadTree2.topLeft);
      Node topRight = intersect(quadTree1.topRight, quadTree2.topRight);
      Node bottomLeft = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
      Node bottomRight = intersect(quadTree1.bottomRight, quadTree2.bottomRight);

      Node newNode;
      if ((topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf) &&
        (topLeft.val == topRight.val && topLeft.val == bottomLeft.val && topLeft.val == bottomRight.val)) {
         newNode = new Node(topLeft.val, true, null, null, null, null);
      } else {
         newNode = new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
      }

      return newNode;
   }



   static class Node {
      public boolean val;
      public boolean isLeaf;
      public Node topLeft;
      public Node topRight;
      public Node bottomLeft;
      public Node bottomRight;

      public Node() {}

      public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
         val = _val;
         isLeaf = _isLeaf;
         topLeft = _topLeft;
         topRight = _topRight;
         bottomLeft = _bottomLeft;
         bottomRight = _bottomRight;
      }

      @Override
      public boolean equals(Object o) {
         if (this == o) {
            return true;
         }
         if (!(o instanceof Node)) {
            return false;
         }
         Node node = (Node) o;
         return val == node.val && isLeaf == node.isLeaf && Objects.equals(topLeft, node.topLeft) && Objects.equals(topRight, node.topRight) && Objects.equals(bottomLeft, node.bottomLeft) && Objects.equals(bottomRight, node.bottomRight);
      }

      @Override
      public int hashCode() {
         return Objects.hash(val, isLeaf, topLeft, topRight, bottomLeft, bottomRight);
      }
   };
}
