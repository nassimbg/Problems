import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import common.Point;

public class MaxPointsOnALine {
   /**
    * This solution Not working look at one of the solutions in the discussions but its not worth to do it
    * @param points
    * @return
    */
   public static int maxPoints(Point[] points) {

      if (points.length < 2) {
         return points.length;
      }
      Map<LineEquation, Set<Integer>> linesCounter = new HashMap<>();
      int maxNumber = 0;

      for (int firstIndex = 0; firstIndex < points.length; firstIndex++) {
         for (int secondIndex = firstIndex + 1; secondIndex < points.length; secondIndex++) {
            Point firstPoint = points[firstIndex];
            Point secondPoint = points[secondIndex];

            double slope = (firstPoint.y - secondPoint.y);
            if (slope != 0){
               int XDiff = firstPoint.x - secondPoint.x;
               slope = XDiff == 0 ? Double.MAX_VALUE : (double)slope/(double)XDiff;
            }
            double x = slope == Double.MAX_VALUE ? firstPoint.x : Double.MAX_VALUE;
            double yIntercept = slope == Double.MAX_VALUE ? Double.MAX_VALUE : firstPoint.y -(slope* firstPoint.x);

            Set<Integer> integers = linesCounter.computeIfAbsent(new LineEquation(slope, yIntercept, x), k -> new HashSet<>());
            integers.add(firstIndex);
            integers.add(secondIndex);


            maxNumber = Math.max( maxNumber, integers.size());
         }
      }

      return maxNumber;

   }

   private static final class LineEquation {
      private final double slope;
      private final double yIntercept;
      private final double x;

      private LineEquation(double slope, double yIntercept, double x) {
         this.slope = slope;
         this.yIntercept = yIntercept;
         this.x = x;
      }

      @Override
      public boolean equals(Object o) {
         if (this == o) {
            return true;
         }
         if (!(o instanceof LineEquation)) {
            return false;
         }
         LineEquation that = (LineEquation) o;
         return Double.compare(that.slope, slope) == 0 && Double.compare(that.yIntercept, yIntercept) == 0;
      }

      @Override
      public int hashCode() {
         return Objects.hash(slope, yIntercept);
      }
   }
}
