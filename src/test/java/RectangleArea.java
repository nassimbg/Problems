public class RectangleArea {
   public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

      int area1 = Math.abs(D-B) * Math.abs(C-A);
      int area2 = Math.abs(H-F) * Math.abs(G-E);

      int areaToRemove = 0;
      //they intersect
      int secondLeft = Math.max(A,E);
      int secondRight = Math.max(C,G);
      int secondBottom = Math.max(B,F);
      int secondTop = Math.max(D,H);
      if (secondLeft < secondRight && secondBottom < secondTop) {


         int secondLeftY= secondLeft == A ? D : H;

         int secondBottomX= secondBottom == B ? C : G;

         areaToRemove = Math.abs(secondLeft - secondBottomX) * Math.abs(secondLeftY - secondBottom);

      }

      return area1 + area2 - areaToRemove;


   }
}
