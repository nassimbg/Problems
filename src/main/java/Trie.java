import static common.TrieNode.transformCharToInt;

import common.TrieNode;

public class Trie {


   TrieNode head;
   /** Initialize your data structure here. */
   public Trie() {
      head = new TrieNode();

   }

   /** Inserts a word into the trie. */
   public void insert(String word) {

      TrieNode current = head;

      for (int i = 0; i < word.length(); i++) {
         int charAt = transformCharToInt(word.charAt(i));

         current = current.addChildIfNotExist(charAt);
      }

      current.isLeaf = true;

   }

   /** Returns if the word is in the trie. */
   public boolean search(String word) {

      TrieNode current = head;

      for (int i = 0; i < word.length(); i++) {
         int charAt = transformCharToInt(word.charAt(i));

         if (current.children[charAt] != null) {
            current = current.children[charAt];
         } else {
            return false;
         }
      }

      return current.isLeaf;
   }

   /** Returns if there is any word in the trie that starts with the given prefix. */
   public boolean startsWith(String prefix) {
      TrieNode current = head;

      for (int i = 0; i < prefix.length(); i++) {
         int charAt = transformCharToInt(prefix.charAt(i));

         if (current.children[charAt] != null) {
            current = current.children[charAt];
         } else {
            return false;
         }
      }

      return true;
   }


}
