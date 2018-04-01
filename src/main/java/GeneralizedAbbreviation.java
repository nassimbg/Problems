import java.util.ArrayList;
import java.util.List;

public class GeneralizedAbbreviation {
    static List<String> solution(String word) {
        char[] chars = word.toCharArray();

        ArrayList<String> words = new ArrayList<>();
        dfsOnWord(chars, 0, words);
        return words;
    }

    private static void dfsOnWord(char[] chars, int index, List<String> words) {
        if (index == chars.length) {
            StringBuilder stringBuilder = new StringBuilder();

            int countOfStars = 0;
            for (char aChar : chars) {
                if (aChar != '*') {

                    if (countOfStars > 0) {
                        stringBuilder.append(countOfStars);
                        countOfStars = 0;
                    }
                    stringBuilder.append(aChar);
                } else {
                    ++countOfStars;
                }
            }

            if (countOfStars > 0) {
                stringBuilder.append(countOfStars);
            }

            words.add(stringBuilder.toString());
        } else {
            dfsOnWord(chars, index + 1, words);
            char currentChar = chars[index];
            chars[index] = '*';
            dfsOnWord(chars, index + 1, words);
            chars[index] = currentChar;
        }
    }
}
