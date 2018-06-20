import java.util.ArrayDeque;
import java.util.Deque;

public class LongestAbsoluteFilePath {

   // make sue / is added between the lengths
   public static int lengthLongestPath(String input) {

      int longestLength = 0;

      Deque<Integer> stack = new ArrayDeque<>();
      int index = 0;
      while (index < input.length()) {
         int countTabs = 0;
         while (index < input.length() && input.charAt(index) == '\t') {
            ++countTabs;
            index ++;
         }

         while (countTabs < stack.size()) {
            stack.pollLast();
         }

         int sizeOfCurrentFile = 0;
         boolean isFile = false;
         while(index < input.length() && ! ( input.charAt(index) == '\n' )) {
            char c = input.charAt(index);

               ++sizeOfCurrentFile;
               if (c == '.') {
                  isFile = true;
               }
            ++index;
         }

         if (index < input.length()) {
            index ++;
         }

         Integer lastCummulativeLength = stack.peekLast();
         if (lastCummulativeLength != null) {
            sizeOfCurrentFile += (lastCummulativeLength + 1);
         }

         stack.addLast(sizeOfCurrentFile);

         if (isFile) {
            longestLength = Math.max(longestLength, sizeOfCurrentFile);
         }


      }

      return longestLength;
   }




}
