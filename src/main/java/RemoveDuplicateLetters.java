import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] characIndexTaken = new int[26];
        char[] charsInString = s.toCharArray();

        int lastCharAdded = 0;
        for (int index = charsInString.length - 1; index >= 0; --index) {
            int value = charsInString[index] - 'a';

            if (characIndexTaken[value] != 0) {
                int indexToReplaceByStar = index;
                if (charsInString[index] < charsInString[lastCharAdded]) {
                    indexToReplaceByStar = characIndexTaken[value];
                    characIndexTaken[value] = index;
                    lastCharAdded = index;
                }

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    charsInString[indexToReplaceByStar] = '*';

            } else {
                characIndexTaken[value] = index;
                lastCharAdded = index;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (char aCharsInString : charsInString) {
            if (aCharsInString != '*') {
                stringBuilder.append(aCharsInString);
            }
        }

        return stringBuilder.toString();
    }
}
