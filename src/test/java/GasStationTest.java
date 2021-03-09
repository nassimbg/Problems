import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GasStationTest {
   @Test
   public void canCompleteCircuit() throws Exception {
      assertEquals(-1, GasStation.canCompleteCircuit(new int[] { 4 }, new int[] { 5 }));
   }


   @Test
   public void canCompleteCircuit2() throws Exception {
      int[] gas = new int[] { 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66 };
      int[] cost = new int[]{27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
      assertEquals(74, GasStation.canCompleteCircuit(gas, cost));
   }

   @Test
   public void testIntegerReplacement1() {
      final int startingStation = GasStation.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2});
      assertEquals(3, startingStation);
   }


   @Test
   public void testIntegerReplacement3() {
      final int startingStation = GasStation.canCompleteCircuit(new int[]{5}, new int[]{4});
      assertEquals(0, startingStation);
   }
}
