import common.TrieAlphaNode;

public class WordDictionary {

   private final TrieAlphaNode head = new TrieAlphaNode();

   /**
    * Initialize your data structure here.
    */
   public WordDictionary() {

   }

   /**
    * Adds a word into the data structure.
    */
   public void addWord(String word) {
      TrieAlphaNode current = head;
      for (int i = 0; i < word.length(); i++) {
         int index = transformCharToInt(word.charAt(i));
         current = current.addChildIfNotExist(index);
      }

      current.isLeaf = true;
   }

   /**
    * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
    */
   public boolean search(String word) {
      return searchRecursively(word, 0, head);
   }

   private boolean searchRecursively(String word, int index, TrieAlphaNode current) {

      if (index >= word.length()) {
         return current.isLeaf;
      }

      char charAt = word.charAt(index);

      if (charAt != '.') {
         int charValue = transformCharToInt(charAt);

         return current.children[charValue] != null && searchRecursively(word, index + 1, current.children[charValue]);
      } else {
         for (int childIndex = 0; childIndex < current.children.length; childIndex++) {
            if (current.children[childIndex] != null && searchRecursively(word, index + 1, current.children[childIndex])) {
               return true;
            }
         }
      }

      return false;

   }

   private static int transformCharToInt(char c) {
      return c - 'a';
   }

}
