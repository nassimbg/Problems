import static org.junit.Assert.*;

import org.junit.Test;

public class QuadTreeIntersectionTest {

   @Test
   public void intersect() {
      QuadTreeIntersection.Node n2TopLeftA = new QuadTreeIntersection.Node(true, true, null, null, null, null);
      QuadTreeIntersection.Node n2TopRightA = new QuadTreeIntersection.Node(true, true, null, null, null, null);
      QuadTreeIntersection.Node n2BottomLeftA = new QuadTreeIntersection.Node(false, true, null, null, null, null);
      QuadTreeIntersection.Node n2BottomRightA = new QuadTreeIntersection.Node(false, true, null, null, null, null);
      QuadTreeIntersection.Node a = new QuadTreeIntersection.Node(false, false, n2TopLeftA, n2TopRightA, n2BottomLeftA, n2BottomRightA);





      QuadTreeIntersection.Node n3TopLeftB = new QuadTreeIntersection.Node(false, true, null, null, null, null);
      QuadTreeIntersection.Node n3TopRightB = new QuadTreeIntersection.Node(false, true, null, null, null, null);
      QuadTreeIntersection.Node n3BottomLeftB = new QuadTreeIntersection.Node(true, true, null, null, null, null);
      QuadTreeIntersection.Node n3BottomRightB = new QuadTreeIntersection.Node(true, true, null, null, null, null);
      QuadTreeIntersection.Node n2TopRightB = new QuadTreeIntersection.Node(true, false, n3TopLeftB, n3TopRightB, n3BottomLeftB, n3BottomRightB);

      QuadTreeIntersection.Node n2TopLeftB = new QuadTreeIntersection.Node(true, true, null, null, null, null);
      QuadTreeIntersection.Node n2BottomLeftB = new QuadTreeIntersection.Node(true, true, null, null, null, null);
      QuadTreeIntersection.Node n2BottomRightB = new QuadTreeIntersection.Node(false, true, null, null, null, null);
      QuadTreeIntersection.Node b = new QuadTreeIntersection.Node(false, false, n2TopLeftB, n2TopRightB, n2BottomLeftB, n2BottomRightB);

      QuadTreeIntersection.Node c = QuadTreeIntersection.intersect(a, b);




      QuadTreeIntersection.Node n2TopLeftEx = new QuadTreeIntersection.Node(true, true, null, null, null, null);
      QuadTreeIntersection.Node n2TopRightEx = new QuadTreeIntersection.Node(true, true, null, null, null, null);
      QuadTreeIntersection.Node n2BottomLeftEx = new QuadTreeIntersection.Node(true, true, null, null, null, null);
      QuadTreeIntersection.Node n2BottomRightEx = new QuadTreeIntersection.Node(false, true, null, null, null, null);
      QuadTreeIntersection.Node expected = new QuadTreeIntersection.Node(false, false, n2TopLeftEx, n2TopRightEx, n2BottomLeftEx, n2BottomRightEx);

      assertEquals(expected, c);
   }
}