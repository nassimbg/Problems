import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MinimumGeneticMutation {
   public static int minMutation(String start, String end, String[] bank) {
      Map<Character, Integer> indexOfGene = getGeneIndecies();

      TrieNode root = buildTrieDictionary(indexOfGene, bank);

      Map<String, Integer> dp = new HashMap<>();
      dp.put(end, 0);

      int minValue = findMinRout(indexOfGene, root, start, end, dp, new HashSet<>());

      return minValue == Integer.MAX_VALUE ? -1 : minValue;
   }

   private static Map<Character, Integer> getGeneIndecies() {
      Map<Character, Integer> indexOfGene = new HashMap<>();
      indexOfGene.put('A', 0);
      indexOfGene.put('C', 1);
      indexOfGene.put('G', 2);
      indexOfGene.put('T', 3);

      return indexOfGene;

   }

   private static TrieNode buildTrieDictionary(Map<Character, Integer> indexOfGene, String[] bank) {
      TrieNode root = new TrieNode();

      for(String word : bank) {
         insertWord(indexOfGene, root, word);
      }
      return root;
   }

   private static void insertWord(Map<Character, Integer> indexOfGene, TrieNode root, String word) {

      TrieNode current = root;
      for(int index = 0; index < word.length(); ++index) {
         int geneIndex = indexOfGene.get(word.charAt(index));

         if (current.children[geneIndex] == null) {
            current.children[geneIndex] = new TrieNode();
         }
         current = current.children[geneIndex];
      }

      current.value = word;
   }

   private static int findMinRout(Map<Character, Integer> indexOfGene, TrieNode bank, String start, String end, Map<String, Integer> dp, Set<String> inVisit) {
      int dpValue = dp.getOrDefault(start, -1);
      if (dpValue != -1) {
         return dpValue;
      }

      inVisit.add(start);

      List<String> candidateWords = new ArrayList<>();
      candidateWords(indexOfGene, start, 0, 0, bank, candidateWords);

      int minValue = Integer.MAX_VALUE;
      for(String candidate : candidateWords) {
         if (!inVisit.contains(candidate)) {
            minValue = Math.min(minValue, findMinRout(indexOfGene, bank, candidate, end, dp, inVisit));
         }
      }

      if (minValue != Integer.MAX_VALUE) {
         minValue++;
      }

      dp.put(start, minValue);
      inVisit.remove(start);

      return minValue;
   }

   private static void candidateWords(Map<Character, Integer> indexOfGene, String start, int index, int diffCount, TrieNode currentNode, List<String> candidateWords) {

      if (currentNode != null && diffCount <= 1 && !currentNode.value.isEmpty()) {
         candidateWords.add(currentNode.value);
      }

      if (diffCount > 1 || start.isEmpty() || currentNode == null || index == start.length()) {
         return;
      }

      char c = start.charAt(index);
      int indexGene = indexOfGene.get(c);

      TrieNode[] children = currentNode.children;
      for(int currentGeneIndex = 0; currentGeneIndex < children.length; ++currentGeneIndex) {
         int currentDiffCount = diffCount;

         if (indexGene != currentGeneIndex) {
            ++currentDiffCount;
         }

         candidateWords(indexOfGene, start, index + 1, currentDiffCount, children[currentGeneIndex], candidateWords);
      }
   }

   private static final class TrieNode {

      private final TrieNode[] children;
      private String value;

      TrieNode() {
         this.children = new TrieNode[4];
         this.value = "";
      }

   }
}
