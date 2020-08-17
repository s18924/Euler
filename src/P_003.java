import java.util.ArrayList;
import java.util.List;

public class P_003 {
    public static void main(String[] args) {
        System.out.println(primeFactorsOfNumber(600851475143L));
    }

    static private List<Integer> primeFactorsOfNumber(long number) {
        List<Integer> primeFactors = new ArrayList<>();

        while (number % 2 == 0) {
            primeFactors.add(2);
            number /= 2;

        }
        double end = Math.sqrt(number);
        for (int i = 3; i <= end; i += 2) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
                System.out.println(number);
            }

            if (i > number)
                break;
        }
        return primeFactors;
    }
}

/*


The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */