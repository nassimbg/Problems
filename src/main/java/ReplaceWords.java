import common.Utils;

import java.util.List;
import java.util.Optional;

public class ReplaceWords {

  public static String replaceWords(List<String> dictionary, String sentence) {
    Trie trie = buildTrie(dictionary);

    StringBuilder mainStr = new StringBuilder();
    StringBuilder currentStringStr = new StringBuilder();
    for (int i = 0; i < sentence.length(); i++) {
      final char c = sentence.charAt(i);

      if (Character.isWhitespace(c)) {
        if (currentStringStr.length() > 0) {
          final String word = currentStringStr.toString();
          mainStr.append(trie.findPrefix(word).orElse(word));
          currentStringStr = new StringBuilder();
        }

        mainStr.append(c);

      } else {
        currentStringStr.append(c);
      }
    }

    if (currentStringStr.length() > 0) {
      final String word = currentStringStr.toString();
      mainStr.append(trie.findPrefix(word).orElse(word));
    }

    return mainStr.toString();
  }

  private static Trie buildTrie(final List<String> dictionary) {
    Trie trie = new Trie();
    for (final String s : dictionary) {
      trie.addWord(s);
    }
    return trie;
  }

  private static class Trie {
    private final TrieNode root;

    private Trie() {
      root = new TrieNode();
    }

    Optional<String> findPrefix(String s) {
      TrieNode current = root;
      StringBuilder str = new StringBuilder();

      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        final Optional<TrieNode> optionalChild = current.findChild(charToIndex(c));

        if (optionalChild.isPresent()) {
          current = optionalChild.get();
          str.append(c);
          if (current.isLeaf) {
            return Optional.of(str.toString());
          }
        } else {
          break;
        }
      }

      return Optional.empty();
    }

    void addWord(String s) {
      TrieNode current = root;
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        current = current.addChildIfAbsent(charToIndex(c));
      }

      current.isLeaf = true;
    }

    int charToIndex(char c) {
      return Utils.lowerCaseCharToInt(c);
    }
  }

  private static class TrieNode {
    private final TrieNode[] children;
    private boolean isLeaf;

    private TrieNode() {
      children = new TrieNode[26];
    }

    TrieNode addChildIfAbsent(int index) {
      if (children[index] == null) {
        children[index] = new TrieNode();
      }

      return children[index];
    }

    Optional<TrieNode> findChild(int index) {
      return Optional.ofNullable(children[index]);
    }
  }
}
