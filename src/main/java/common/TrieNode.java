package common;

public class TrieNode {
   public TrieNode[] children = new TrieNode[26];
   public boolean isLeaf = false;
   public int childrenSize = 0;


   public TrieNode addChildIfNotExist(int index) {
      ++childrenSize;
      if (children[index] == null) {
         children[index] = new TrieNode();
      }

      return children[index];
   }

   public static int transformCharToInt(char c) {
      return c - 'a';
   }


}
