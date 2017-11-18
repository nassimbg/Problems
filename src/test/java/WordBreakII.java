import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("Duplicates")
public class WordBreakII {



   // this solution is using DP recursively I brought it from one of discussions
   public static List<String> wordBreak4(String s, List<String> wordDict) {
      HashMap<String,List<String>> map = new HashMap<String,List<String>>();
      return wordBreakRec(s, new HashSet<>(wordDict), map);
   }
   public static List<String> wordBreakRec(String s, Set<String> wordDict, HashMap<String, List<String>> map) {
      List<String> res = new ArrayList<String>();
      if(s == null || s.length() == 0) {
         return res;
      }
      if(map.containsKey(s)) {
         return map.get(s);
      }
      if(wordDict.contains(s)) {
         res.add(s);
      }
      for(int i = 1 ; i < s.length() ; i++) {
         String t = s.substring(i);
         if(wordDict.contains(t)) {
            List<String> temp = wordBreakRec(s.substring(0 , i) , wordDict, map);
            if(temp.size() != 0) {
               for(int j = 0 ; j < temp.size() ; j++) {
                  res.add(temp.get(j) + " " + t);
               }
            }
         }
      }
      map.put(s , res);
      return res;
   }

   // this dp should be fast but didnt complete it its similar to the next dp

   /**
    * <a href="https://www.programcreek.com/2014/03/leetcode-word-break-ii-java/">Solution 2</a>
    * The above link explains what I was trying to do in this solution
    * @param s
    * @param wordDict
    * @return
    */
   public static List<String> wordBreak(String s, List<String> wordDict) {

      if(s.isEmpty()) {
         return new ArrayList<>();
      }
      HashSet<String> dic = new HashSet<>(wordDict);

      List<List<Integer>> dp = new ArrayList<>(s.length() + 1);


      dp.add(Arrays.asList(-1));

      for (int startIndex = s.length() - 1; startIndex >= 0; startIndex--) {
         List<Integer> currentStrings = new ArrayList<>();
         dp.add(currentStrings);

         StringBuilder stringBuilder = new StringBuilder();
         for (int endIndexExclude = startIndex + 1; endIndexExclude <= s.length(); endIndexExclude++) {
            stringBuilder.append(s.charAt(endIndexExclude - 1));

            List<Integer> stringCombinationAtEndIndexEx = dp.get(s.length() - endIndexExclude);
            if (!stringCombinationAtEndIndexEx.isEmpty()) {
               String currentWord = stringBuilder.toString();

               if (dic.contains(currentWord)) {
                  currentStrings.add(endIndexExclude);
               }
            }
         }
      }
      return null;
   }

   public static List<String> wordBreak9(String s, List<String> wordDict) {

      if(s.isEmpty()) {
         return new ArrayList<>();
      }
      HashSet<String> dic = new HashSet<>(wordDict);

      List<List<String>> dp = new ArrayList<>(s.length() + 1);


      dp.add(Arrays.asList(""));

      for (int startIndex = s.length() - 1; startIndex >= 0; startIndex--) {
         List<String> currentStrings = new ArrayList<>();

         StringBuilder stringBuilder = new StringBuilder();
         for (int endIndexExclude = startIndex + 1; endIndexExclude <= s.length(); endIndexExclude++) {
            stringBuilder.append(s.charAt(endIndexExclude - 1));

            List<String> stringCombinationAtEndIndexEx = dp.get(s.length() - endIndexExclude);
            if (!stringCombinationAtEndIndexEx.isEmpty()) {
               String currentWord = stringBuilder.toString();

               if (dic.contains(currentWord)) {

                  for (String combinationAtEndIndexEx : stringCombinationAtEndIndexEx) {

                     if (!combinationAtEndIndexEx.isEmpty()) {
                        currentStrings.add(currentWord + " " + combinationAtEndIndexEx);
                     } else {
                        currentStrings.add(currentWord);
                     }
                  }
               }
            }
         }
         dp.add(currentStrings);

      }
      return dp.get(s.length());
   }
   public static List<String> wordBreak6(String s, List<String> wordDict) {
      HashSet<String> dic = new HashSet<>(wordDict);
      List<String> result = new ArrayList<>();
      List<Integer> delimeter = new ArrayList<>();

      delimeter.add(0);
      wordRec(s, delimeter, 0, dic, result);

      return result;
   }

   private static void wordRec(String s, List<Integer> delimeter, int start, Set<String> dic, List<String> result) {

      StringBuilder tempStringBuilder = new StringBuilder();
      if (s.length() > 0 && start == s.length()) {

         int indexDelimiter = 1;
         for (int index = 0; index < s.length(); index++) {
            if (index == delimeter.get(indexDelimiter) ) {
               tempStringBuilder.append(" ");
               ++indexDelimiter;
            }

            tempStringBuilder.append(s.charAt(index));

         }
         result.add(tempStringBuilder.toString());
      }


      for (int index = start; index < s.length(); index++) {
         tempStringBuilder.append(s.charAt(index));

         if (dic.contains(tempStringBuilder.toString())) {
            delimeter.add(index + 1);
            wordRec(s, delimeter, index + 1, dic, result);
            delimeter.remove(delimeter.size() - 1);
         }
      }
   }

}
