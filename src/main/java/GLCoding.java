import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class GLCoding {


  public static Character problem3(String val) {
    if (val == null || val.isEmpty()) {
      return null;
    }

    int length = val.length();
    Map<Character, Integer> foundChars = new HashMap<>();

    Character firstOcc = null;
    int minIndex = Integer.MAX_VALUE;
    for(int i = 0; i < length; i++) {
      char currentChar = val.charAt(i);

      Integer firstIndex = foundChars.get(currentChar);
      if (firstIndex != null) {

        if (minIndex > firstIndex) {
          firstOcc = currentChar;
          minIndex = firstIndex;
        }
      } else {
        foundChars.put(currentChar, i);
      }
    }

    return firstOcc;
  }

  private static class Node {
    int val;
    Node next;

    Node(int val) {
      this.val = val;
    }
  }

  public static boolean problemTwo(Node head) {
    Node slowPointer = head;
    Node fastPointer = head;

    while(fastPointer != null && fastPointer.next != null) {
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;

      if (slowPointer == fastPointer) {
        return true;
      }
    }

    return false;
  }
  public static boolean questionOne(String val) {

    if (val == null || val.isEmpty()) {
      return true;
    }

    Map<Character, Character> closingBracketsMapping = createBracketsMapping();

    Deque<Character> stack = new ArrayDeque<>();
    final int length = val.length();
    for (int index = 0; index < length; index++) {
      char currentChar = val.charAt(index);

      final Character openBracket = closingBracketsMapping.get(currentChar);

      if (openBracket == null) {
        stack.addLast(currentChar);
      } else {
        if (stack.isEmpty() || stack.pollLast().charValue() != openBracket.charValue()) {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

  private static Map<Character, Character> createBracketsMapping() {
    Map<Character, Character> bracketsMapping = new HashMap<>();

    bracketsMapping.put(')', '(');
    bracketsMapping.put('}', '{');
    bracketsMapping.put(']', '[');
    return bracketsMapping;
  }

}
