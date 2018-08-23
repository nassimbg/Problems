import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class NArraySerializer {

   private static final String DELIM = "$&@";

   public Node deserialize(String value) {
      //todo use StringTokenizer
      StringTokenizer deserialization = new StringTokenizer(value, DELIM);
      return deserializeRecurive(deserialization);
   }

   private Node deserializeRecurive(StringTokenizer deserialization) {

      Node currentNode = null;
      if (deserialization.hasMoreTokens()) {
         String token = deserialization.nextToken();
         if (token.equals("#")) {
            return currentNode;
         }

         currentNode = new Node(token);
         //todo use the size of children/node to know how much to loop
         int childrenSize = Integer.parseInt(deserialization.nextToken());

         for(int childIndex = 0; childIndex < childrenSize; ++childIndex) {
            currentNode.add(deserializeRecurive(deserialization));
         }
      }
      return currentNode;
   }


   public String serialize(Node node) {
      StringJoiner serialization = new StringJoiner(DELIM);
      appendValueRec(serialization, node);

      return serialization.toString();
   }

   private void appendValueRec(StringJoiner serialization, Node node) {
      if (node != null) {
         //todo add the size of children/node
         serialization.add(node.value).add(Integer.toString(node.children.size()));

         for(Node child : node.children) {
            appendValueRec(serialization, child);
         }

      } else {
         serialization.add("#");
      }
   }

   public static final class Node {
      private final String value;
      private final List<Node> children;

      Node(String value) {
         this.value = value;
         this.children = new ArrayList<>();
      }

      void add(Node node) {
         children.add(node);
      }

   }
}
