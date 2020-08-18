import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class P_010 {
    public static void main(String[] args) {
        boolean[] numbers = new boolean[2000000];
        List<Integer> primes = new LinkedList<>();
        for (int i = 2; i < numbers.length; i++) {
            if(numbers[i]==false){
                primes.add(i);
                numbers[i]=true;
                for (int j = 0; j < numbers.length; j+=i) {
                    numbers[j]=true;
                }
            }
        }

        System.out.println(primes);
        BigInteger sum = new BigInteger("0");
        for (Integer prime : primes) {
            sum=sum.add(BigInteger.valueOf(prime));
        }
        System.out.println(sum);
    }
}
/*


The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

 */
