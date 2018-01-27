public class BitwiseANDOfNumbersRange {

   /**
    * pass through every bit and check if this bit is a 1 in m
    * if no => no need to consider
    * if yes => we need to check if this bit will flip at any point in the range
    *    if this bit flips => we dont consider it
    *    if this bit does not change => we consider it
    *    To check if this bit changes we remove the below bits from hit to have the number in its minimum
    *    and add to 1 add that current bit. if this addtion is greater than n => this bit never changes=> we consider it
    *
    *    now why do we remove the below bits {@code removeBelowBits} and add it by {@code powerofTwo}:
    *       consider we have 0101 to see if the third bit changes we need to add at least by 11 => 0101 + 11 = 1000 = (0100 + 1) + 11 = 0100 + (1 + 11) = 100 + 100 = 1000
    *
    *    after the addition we check if the added number is < n => if it is then this bit will flip so dont consider it else it wont flip then consider it
    *
    *    This solution turns out is similar to the common bit prefix problem see second solution
    * @param m
    * @param n
    * @return
    */
   public static int rangeBitwiseAnd(int m, int n) {

      int result = 0;
      int temp = 0;
      for (int i = 0; i < 32; ++i) {
         int powerofTwo = 1 << i;
         if ((m & powerofTwo) != 0) {
            int removeBelowBits = m - temp;
            if (n - removeBelowBits < powerofTwo) {
               result +=powerofTwo;
            }
            temp +=powerofTwo;
         }
      }

      return result;
   }

   /**
    * this solution is called "find the common prefix of m and n 's binary code"
    *  why this solution works?
    *
    *  looking at the above solution we where looking at the bits that don't flip
    *  so if we reach a bit that never flips in the range => all the left bit will never change in this range (if bit 2 never changes => definitely the large bits (left bit wont change) )
    *  To find the bits that dont change we should find the first bit that doesnt => to do so we keep pushing the bits right in{@code m}  and {@code n} until they become the same
    *  => we would know that this range of bits has never changed
    *
    *  NOTE: if bit k in m and n is one and we want to check if this bit has flipped in this range => a left bit in n should be diff than that in m
    *  => that is why we try to find the common prefix
    *
    * @param m
    * @param n
    * @return
    */

   public int rangeBitwiseAnd2(int m, int n) {
      int count = 0;
      while(m != n){
         m >>= 1;
         n >>= 1;
         count++;
      }
      return m<<=count;
   }
}
