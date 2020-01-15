import org.junit.Test;

public class ConstructBinaryTreefromPreorderandInorderTraversalTest {
   @Test
   public void buildTree() throws Exception {
      ConstructBinaryTreefromPreorderandInorderTraversal.buildTree(new int[] { 1, 2 }, new int[] { 1, 2 });
   }


   @Test
   public void buildTree2() throws Exception {
      ConstructBinaryTreefromPreorderandInorderTraversal.buildTree(new int[] { 1, 2, 3 }, new int[] { 1,3,2});
   }

   @Test
   public void buildTree3() throws Exception {
      ConstructBinaryTreefromPreorderandInorderTraversal.buildTree(new int[] { 1, 2, 3 }, new int[] { 2, 1,3});
   }

}