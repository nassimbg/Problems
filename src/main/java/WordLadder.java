import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadder {
   public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

      TrieAlphaNode head = buildDict(wordList);

      return bfs(beginWord, endWord, head);
   }

   private static TrieAlphaNode buildDict(List<String> wordList) {
      TrieAlphaNode head = new TrieAlphaNode();

      for(String word : wordList) {

         TrieAlphaNode current = head;
         for(int index = 0; index < word.length(); ++index) {
            int charIndex = getAlphaIndex(word.charAt(index));

            if (current.children[charIndex] == null) {
               current.children[charIndex] = new TrieAlphaNode();
            }

            current = current.children[charIndex];
         }

         current.isLeaf = true;
      }

      return head;
   }

   private static int bfs(String beginWord, String endWord, TrieAlphaNode head) {
      Deque<String> queue = new ArrayDeque<>();

      Set<String> usedWords = new HashSet<>();

      queue.addLast(beginWord);

      int numberOfEdges = 0;
      while(!queue.isEmpty()) {
         int frontierSize = queue.size();

         for (int counter = 0; counter < frontierSize; ++counter) {
            String currentWord = queue.pollFirst();
            usedWords.add(currentWord);

            for(String adjWord : getAdjWords(currentWord, head)) {

               if (adjWord.equals(endWord)) {
                  return numberOfEdges + 2;
               }

               if (!usedWords.contains(adjWord)) {
                  queue.addLast(adjWord);

               }
            }
         }

         numberOfEdges++;
      }

      return 0;
   }

   private static Collection<String> getAdjWords(String currentWord, TrieAlphaNode head) {
      List<String> similarWords = new ArrayList<>();
      fetchSimilarWords(currentWord, head, similarWords, 0, new char[currentWord.length()], 1);

      return similarWords;
   }

   private static void fetchSimilarWords(String word, TrieAlphaNode head, List<String> similarWords, int index, char[] charSeq, int errorThreshold) {


      char c = word.charAt(index);
      TrieAlphaNode child = head.children[getAlphaIndex(c)];

      if (child != null) {
         charSeq[index] = c;
         if (child.isLeaf) {
            similarWords.add(new String(charSeq));
         } else {
            fetchSimilarWords(word, child, similarWords, index + 1, charSeq, errorThreshold);
         }
      }

      if (errorThreshold > 0) {
         for(int childIndex = 0; childIndex < head.children.length; childIndex++) {
            TrieAlphaNode otherChild = head.children[childIndex];

            if (otherChild != null) {
               charSeq[index] =(char) ('a' + childIndex);

               if (otherChild.isLeaf) {
                  similarWords.add(new String(charSeq));
               } else {
                  fetchSimilarWords(word, otherChild, similarWords, index + 1, charSeq, errorThreshold - 1);
               }

            }
         }
      }

   }


   private static int getAlphaIndex(char c) {
      return c - 'a';
   }

   private static class TrieAlphaNode {
      private TrieAlphaNode[] children = new TrieAlphaNode[26];
      private boolean isLeaf;

   }
}
