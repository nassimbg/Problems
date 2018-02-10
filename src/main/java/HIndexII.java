public class HIndexII {
   public int hIndex(int[] citations) {

      int start = 0;
      int end = citations.length - 1;

      while(start <= end) {
         int mid = (start + end)/2;

         int rankFromLast = citations.length - mid;

         if (rankFromLast == citations[mid]) {
            return rankFromLast;
         }

         if (rankFromLast > citations[mid]) {
            start = mid + 1;
         } else{
            end = mid - 1;
         }
      }

      return start;

   }
}
