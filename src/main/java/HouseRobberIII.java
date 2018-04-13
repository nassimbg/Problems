import common.TreeNode;

public class HouseRobberIII {
   public int rob(TreeNode root) {
      return postOrderRob(root).getMaxRobingAmount();
   }

   private static RobOptions postOrderRob(TreeNode root) {
      if (root == null) {
         return new RobOptions(0, 0);
      }

      RobOptions leftRob = postOrderRob(root.left);
      RobOptions rightRob = postOrderRob(root.right);

      int rob = root.val + leftRob.notRob + rightRob.notRob;
      int notRob = leftRob.getMaxRobingAmount() + rightRob.getMaxRobingAmount();

      return new RobOptions(rob, notRob);
   }

   private static final class RobOptions {
      int rob;
      int notRob;

      RobOptions(int rob, int notRob) {
         this.rob = rob;
         this.notRob = notRob;
      }

      int getMaxRobingAmount() {
         return Math.max(notRob, rob);
      }
   }
}
