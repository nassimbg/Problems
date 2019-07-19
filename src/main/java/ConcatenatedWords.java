import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ConcatenatedWords {
   public static List<String> findAllConcatenatedWordsInADict(String[] words) {
      Arrays.sort(words, new Comparator<String>() {
         @Override
         public int compare(String o1, String o2) {
            return o1.length() - o2.length();
         }
      });

      Trie trie = new Trie();

      List<String> results = new ArrayList<>();
      for (String word : words) {
         if (trie.isConcatWord(word)) {
            results.add(word);
         }

         trie.add(word);
      }

      return results;
   }

   private static int charToIndex(char c) {
      return c - 'a';
   }

   private static final class Trie {
      private final TrieNode root;

      private Trie() {
         this.root = new TrieNode();
      }

      void add(String val) {
         TrieNode current = root;
         for (int index = 0; index < val.length(); index++) {
            int c = charToIndex(val.charAt(index));

            if (current.children[c] == null) {
               current.children[c] = new TrieNode();
            }

            current = current.children[c];
         }

         current.isLeaf = true;
      }

      boolean isConcatWord(String val) {
         return isConcatWordRec(val, 0);
      }

      boolean isConcatWordRec(String val, int startIndex) {

         TrieNode current = root;
         for (int index = startIndex; index < val.length(); index++) {
            int c = charToIndex(val.charAt(index));

            current = current.children[c];

            if (current == null) {
               return false;
            }

            if (current.isLeaf && isConcatWordRec(val, index + 1)) {
               return true;
            }
         }

         return current.isLeaf;
      }
   }

   private static final class TrieNode {
      private final TrieNode[] children;
      private boolean isLeaf;

      private TrieNode() {
         children = new TrieNode[26];
      }
   }
}
