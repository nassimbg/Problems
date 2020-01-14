package common;

import java.util.List;

public class NarrayTreeNode {
      public int val;
      public List<NarrayTreeNode> children;

      public NarrayTreeNode() {}

      public NarrayTreeNode(int _val) {
         val = _val;
      }

      public NarrayTreeNode(int _val, List<NarrayTreeNode> _children) {
         val = _val;
         children = _children;
      }
}
