import java.util.HashMap;
import java.util.Map;

public class TinyURL {

   public static final int COMBINATION_SIZE = 7;
   public static final int ALPHA_SIZE = 26 + 26 + 10;
   private final String PREFEX_URL = "http://tinyurl.com/";

   private final char[] alpha;
   private final int[] combination;
   private final Map<String, String> shortToLong;
   private final Map<String, String> longToShort;

   TinyURL() {
      alpha = new char[ALPHA_SIZE];

      int index = 0;
      for(int smallChar = 0; smallChar < 26; smallChar++) {
         alpha[index++] = (char)(smallChar + 'a');
      }

      for(int smallChar = 0; smallChar < 26; smallChar++) {
         alpha[index++] = (char)(smallChar + 'A');
      }

      for(int smallChar = 0; smallChar < 10; smallChar++) {
         alpha[index++] = (char)(smallChar + '0');
      }

      combination = new int[COMBINATION_SIZE];

      shortToLong = new HashMap<>();
      longToShort = new HashMap<>();
   }

   // Encodes a URL to a shortened URL.
   public String encode(String longUrl) {

      if (longToShort.containsKey(longUrl)) {
         return PREFEX_URL + longToShort.get(longUrl);
      }

      StringBuilder str = new StringBuilder(COMBINATION_SIZE);

      for (int i = 0; i < COMBINATION_SIZE; i++) {

         if (combination[i] >= ALPHA_SIZE) {
            combination[i + 1]++;
            combination[i] %= ALPHA_SIZE;
         }

         str.append(alpha[combination[i]]);

         if (combination[i] + 1 >= ALPHA_SIZE) {
            combination[i + 1]++;
            combination[i] %= ALPHA_SIZE;
         } else {
            combination[i]++;
         }
      }
      String val = str.toString();

      shortToLong.put(val, longUrl);
      longToShort.put(longUrl, val);
      return PREFEX_URL + val;
   }

   // Decodes a shortened URL to its original URL.
   public String decode(String shortUrl) {

      String shortKey = shortUrl.replace(PREFEX_URL, "");

      return shortToLong.get(shortKey);
   }
}
