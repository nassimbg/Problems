public class Candy {
   public static int candy(int[] ratings) {

      if (ratings.length < 2) {
         return ratings.length;
      }

      int[] optimalPoints = new int[ratings.length];

      int count = 1;
      optimalPoints[0] = 0;

      boolean desending = ratings[0] > ratings[1];

      int currentOptimal = 1;
      for (int i = 2; i < ratings.length; i++) {
         if (desending && ratings[currentOptimal] < ratings[i]) {
               optimalPoints[count++] = currentOptimal;
               desending = false;
         } else if (!desending && ratings[currentOptimal] > ratings[i]) {
               optimalPoints[count++] = currentOptimal;
               desending = true;
         }

         currentOptimal = i;
      }

      optimalPoints[count++] = currentOptimal;

//      if ()

      return count;


   }
}
