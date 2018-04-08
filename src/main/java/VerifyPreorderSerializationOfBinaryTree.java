public class VerifyPreorderSerializationOfBinaryTree {

   int index = 0;

   public boolean isValidSerialization(String preorder) {
      String[] split = preorder.split(",");

      boolean isValid = isValid(split);
      return index >= split.length && isValid;
   }

   private boolean isValid(String[] preorder) {
      return index != preorder.length && (preorder[index++].equals("#") || (isValid(preorder) && isValid(preorder)));
   }
}
