public class MapSumPairs {

  public static class MapSum {
    private final TrieNode root;
    /** Initialize your data structure here. */
    public MapSum() {
      root = new TrieNode();
    }

    public void insert(String key, int val) {

      int length = key.length();

      TrieNode currentNode = root;
      for (int i = 0; i < length; i++) {
        char c = key.charAt(i);

        currentNode = currentNode.getNode(toIndex(c));
      }

      int newSum = val;
      int prevValue = currentNode.getValue();
      if (prevValue != 0) {
        newSum -= prevValue;
      }

      currentNode.setValue(val);


      currentNode = root;
      for (int i = 0; i < length; i++) {
        char c = key.charAt(i);

        currentNode = currentNode.getNode(toIndex(c));
        currentNode.addSum(newSum);
      }
    }

    public int sum(String prefix) {
      int length = prefix.length();

      TrieNode currentNode = root;
      for (int i = 0; i < length; i++) {
        char c = prefix.charAt(i);

        currentNode = currentNode.getNode(toIndex(c));
      }

      return currentNode.getSum();
    }

    private static int toIndex(char c) {
      return c - 'a';
    }

    private static class TrieNode {
      private final TrieNode[] nodes;
      private int subTreeSum;
      private int currentLeafValue;

      TrieNode() {
        nodes = new TrieNode[26];
        subTreeSum = 0;
      }

      TrieNode getNode(int index) {
        if (nodes[index] == null) {
          nodes[index] = new TrieNode();
        }

        return nodes[index];
      }

      void addSum(int sum) {
        subTreeSum += sum;
      }

      int getSum() {
        return subTreeSum;
      }

      void setValue(int value) {
        currentLeafValue = value;
      }

      int getValue() {
        return currentLeafValue;
      }
    }
  }


}
