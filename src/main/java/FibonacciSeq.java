public class FibonacciSeq {

  public static int fibonacciLoop(int nthNumber) {
    //use loop
    int previouspreviousNumber, previousNumber = 0, currentNumber = 1;

    if (nthNumber == 0) {
      return previousNumber;
    }

    for (int i = 2; i <= nthNumber ; i++) {

      previouspreviousNumber = previousNumber;

      previousNumber = currentNumber;

      currentNumber = previouspreviousNumber + previousNumber;

    }
    return currentNumber;
  }


  public static int fibonacciRecursion(int nthNumber) {
    //use recursion
    if (nthNumber == 0) {

      return 0;

    } else if (nthNumber == 1) {

      return 1;
    }
    return fibonacciRecursion(nthNumber - 1) + fibonacciRecursion(nthNumber - 2);
  }
}
