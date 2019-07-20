public class NumberComplement {
   public static int findComplement(int num) {
      int highestOneBit = Integer.highestOneBit(num);
      int mask = (highestOneBit << 1) - 1;

      return num ^ mask;
   }
}
