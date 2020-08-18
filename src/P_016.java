import java.math.BigInteger;
import java.util.Arrays;

public class P_016 {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(BigInteger.valueOf(2).pow(1000).toString().split("")).mapToInt(Integer::parseInt).sum());
    }
}

/*


215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?

Answer:  1366
Completed on Tue, 18 Aug 2020, 17:34

 */