import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * - use a BFS algo starting from the beginWord to build the Pie adj list
 * - use this Pie adj list to apply DFS starting from endWord to save all the paths from endWord to beginWord and then take the min
 */
public class WordLadderII {
   public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
      Map<String, List<String>> adjacencyList = new HashMap<>(wordList.size() + 1);
      HashSet<String> strings = new HashSet<>(wordList);

      createBFSTree(beginWord, endWord, strings, adjacencyList);

      List<List<String>> result = new LinkedList<>();
      List<String> stack = new ArrayList<>();
      if (adjacencyList.containsKey(endWord)) {
         traverseDFS(result, adjacencyList,stack, endWord);
      }

      int minLength = Integer.MAX_VALUE;
      for (int index = 0; index < result.size(); index++) {
         int currentSize = result.get(index).size();
         if (minLength > currentSize) {
            minLength = currentSize;
         }
      }

      Iterator<List<String>> iterator = result.iterator();
      while (iterator.hasNext()) {
         List<String> next = iterator.next();
         if(next.size() != minLength) {
            iterator.remove();
         }
      }

      return result;
   }

   private static void createBFSTree(String beginWord, String endWord, Set<String> words, Map<String, List<String>> adjacencyList) {
      Map<String, Integer> alreadyPassedBy = new HashMap<>(words.size() + 1);
      Queue<String> queue = new ArrayDeque<>();
      queue.add(beginWord);
      adjacencyList.put(beginWord, new ArrayList<>());
      int numberOfNodesInCurrentLevel = 1;
      int numberOfNodesInNextLevel = 0;
      int level = 0;
      alreadyPassedBy.put(beginWord, level);
      while (!queue.isEmpty()) {
         String current = queue.poll();
         words.remove(current);
         --numberOfNodesInCurrentLevel;

         if (current.equals(endWord)) {
            break;
         }

         int nextLevel = level + 1;
         for (int index = 0; index < current.length(); index++) {
         StringBuilder stringBuilder = new StringBuilder(current);
            for (char ch = 'a'; ch <= 'z'; ++ch) {
               stringBuilder.setCharAt(index, ch);
               String word = stringBuilder.toString();
               if (words.contains(word)) {
                  Integer wordsLevel = alreadyPassedBy.get(word);
                  List<String> adjListForCurrentNode = adjacencyList.computeIfAbsent(word, k -> new LinkedList<>());

                  if (wordsLevel == null) {
                     queue.add(word);
                     alreadyPassedBy.put(word, nextLevel);
                     ++numberOfNodesInNextLevel;
                     adjListForCurrentNode.add(current);
                  } else if (wordsLevel == nextLevel) {
                     adjListForCurrentNode.add(current);
                  }
               }
            }
         }

         if (numberOfNodesInCurrentLevel == 0) {
            numberOfNodesInCurrentLevel = numberOfNodesInNextLevel;
            numberOfNodesInNextLevel = 0;
            ++level;
         }
      }
   }

   private static void traverseDFS(List<List<String>> result, Map<String, List<String>> adjacencyList, List<String> stack, String current) {
      List<String> parentOfCurrent = adjacencyList.get(current);
      stack.add(current);

      if (parentOfCurrent.isEmpty()) {
         List<String> newList = new ArrayList<>();
         for (int index = stack.size() - 1; index >= 0; index--) {
            newList.add(stack.get(index));
         }
         result.add(newList);

      } else {
         for (String parent : parentOfCurrent) {
            traverseDFS(result, adjacencyList, stack, parent);
         }
      }
      stack.remove(stack.size() - 1);

   }


}
