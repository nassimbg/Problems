import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchII {

   /**
    * in this problem
    * @param board
    * @param words
    * @return
    */
   public static List<String> findWords(char[][] board, String[] words) {

      if (board.length == 0) {
         return Collections.emptyList();
      }

      WordSearchNode head = new WordSearchNode();

      Set<String> result = new HashSet<>();

      initializeTrie(head, words);
      int rows = board.length;
      int columns = board[0].length;

      boolean[][] inUse = new boolean[rows][columns];
      for (int row = 0; row < rows; row++) {
         for (int column = 0; column < columns; column++) {
            dfs(words, board, head, row, column, result, inUse);
         }
      }
      return new ArrayList<>(result);

   }

   private static void dfs(String[] words, char[][] board, WordSearchNode head, int row, int column, Set<String> result, boolean[][] inUse) {

      if (row >= 0 && row < board.length && column >= 0 && column < board[0].length && !inUse[row][column]) {
         char c = board[row][column];

         WordSearchNode child = head.children[transformCharToInt(c)];
         if (child != null) {
            inUse[row][column] = true;

            if (child.isLeaf) {
               result.add(words[child.wordIndex]);
            }

            dfs(words, board, child, row + 1, column, result, inUse);
            dfs(words, board, child, row - 1, column, result, inUse);
            dfs(words, board, child, row, column + 1, result, inUse);
            dfs(words, board, child, row, column - 1, result, inUse);

            inUse[row][column] = false;
         }
      }
   }

   private static void initializeTrie(WordSearchNode head, String[] words) {
      for (int word = 0; word < words.length; word++) {
         insertWord(words,head, word);
      }
   }

   private static void insertWord(String[] words, WordSearchNode head, int index) {
      String word = words[index];
      WordSearchNode current = head;

      for (int i = 0; i < word.length(); i++) {
         int charAt = transformCharToInt(word.charAt(i));

         current = current.addChildIfNotExist(charAt);
      }

      current.isLeaf = true;
      current.wordIndex = index;
   }

   public static int transformCharToInt(char c) {
      return c - 'a';
   }

   private static final class WordSearchNode {
      int wordIndex;

      public WordSearchNode[] children = new WordSearchNode[26];
      public boolean isLeaf = false;
      public int childrenSize = 0;


      public WordSearchNode addChildIfNotExist(int index) {
         ++childrenSize;
         if (children[index] == null) {
            children[index] = new WordSearchNode();
         }

         return children[index];
      }
   }


}
