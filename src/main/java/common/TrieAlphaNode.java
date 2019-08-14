package common;

public class TrieAlphaNode {
   public TrieAlphaNode[] children = new TrieAlphaNode[26];
   public boolean isLeaf = false;
   public int childrenSize = 0;


   public TrieAlphaNode addChildIfNotExist(int index) {
      ++childrenSize;
      if (children[index] == null) {
         children[index] = new TrieAlphaNode();
      }

      return children[index];
   }

   public static int transformCharToInt(char c) {
      return c - 'a';
   }


}
