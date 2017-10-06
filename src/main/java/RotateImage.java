public class RotateImage {

   public static void rotate(int[][] matrix) {

      for (int len = 0; len < matrix.length/2 ; len++) {
         int lastLine = matrix.length - 1 - len;

         for (int walker = len; walker < lastLine; walker++) {
            int temp = matrix[walker][len];
            matrix[walker][len] = matrix[lastLine][walker];
            matrix[lastLine][walker] = matrix[matrix.length - 1 - walker][lastLine];
            matrix[matrix.length - 1 - walker][lastLine] = matrix[len][matrix.length - 1 - walker];
            matrix[len][matrix.length - 1 - walker] = temp;
         }
      }
   }
}
