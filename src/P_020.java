import java.math.BigInteger;

public class P_020 {
    public static void main(String[] args) {
        BigInteger sum = new BigInteger("1");
        for (int i = 1; i <= 100000; i++) {
            sum = sum.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(sum);

        int sumOfNumbers = 0;
        for (char c : sum.toString().toCharArray()) {
            sumOfNumbers+= c-'0';
        }
        System.out.println(sumOfNumbers);
    }
}

/*


n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!

Answer:  648
Completed on Sun, 16 Aug 2020, 16:25

 */