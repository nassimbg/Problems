import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VerifyPreorderSerializationOfBinaryTreeTest {

   @Test
   public void isValidSerialization() {
      VerifyPreorderSerializationOfBinaryTree verifyPreorderSerializationOfBinaryTree = new VerifyPreorderSerializationOfBinaryTree();

      assertTrue(verifyPreorderSerializationOfBinaryTree.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));

   }

   @Test
   public void isValidSerialization2() {
      VerifyPreorderSerializationOfBinaryTree verifyPreorderSerializationOfBinaryTree = new VerifyPreorderSerializationOfBinaryTree();

      assertFalse(verifyPreorderSerializationOfBinaryTree.isValidSerialization("1,#"));
   }

   @Test
   public void isValidSerialization3() {
      VerifyPreorderSerializationOfBinaryTree verifyPreorderSerializationOfBinaryTree = new VerifyPreorderSerializationOfBinaryTree();

      assertFalse(verifyPreorderSerializationOfBinaryTree.isValidSerialization("9,#,#,1"));
   }

   @Test
   public void isValidSerialization4() {
      VerifyPreorderSerializationOfBinaryTree verifyPreorderSerializationOfBinaryTree = new VerifyPreorderSerializationOfBinaryTree();

      assertTrue(verifyPreorderSerializationOfBinaryTree.isValidSerialization("9,#,92,#,#"));
   }
}