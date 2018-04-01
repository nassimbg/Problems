public class MaximumProductOfWordLengths {
    public static int maxProduct(String[] words) {
        int[] bitRep = new int[words.length];

        for (int wordIndex = 0; wordIndex < words.length; wordIndex++) {
            String word = words[wordIndex];

            for (int charIndex = 0; charIndex < word.length(); charIndex++) {
                char currentChar = word.charAt(charIndex);
                bitRep[wordIndex] |= 1 << (currentChar - 'a');
            }
        }


        int maxValue = 0;
        for (int firstIndex = 0; firstIndex < bitRep.length; firstIndex++) {
            for (int secondIndex = firstIndex; secondIndex < bitRep.length; secondIndex++) {
                if ((bitRep[firstIndex] & bitRep[secondIndex]) == 0) {
                    maxValue = Math.max(words[firstIndex].length() * words[secondIndex].length(), maxValue);
                }
            }
        }

        return maxValue;



    }
}
