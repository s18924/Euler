public class P_007 {
    public static void main(String[] args) {
        int numberOfPrimeNumbersFound = 0;
        int currentNumber=2;

        while(numberOfPrimeNumbersFound!=10001){
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(currentNumber); i++) {
                if(currentNumber%i==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                numberOfPrimeNumbersFound++;
                System.out.println(currentNumber + " is prime! n: " + numberOfPrimeNumbersFound);
            }
            currentNumber++;
        }
    }
}
/*


By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

Answer:  104743
Completed on Mon, 17 Aug 2020, 20:11

 */