import java.math.BigInteger;
import java.util.Arrays;

public class P_030 {
    public static void main(String[] args) {
        int result=0;
        for (int i = 2; i < 999999; i++) {
            long sum = Arrays.stream(String.valueOf(i).split("")).mapToLong(Long::parseLong).map(o-> (long) Math.pow(o,5)).sum();
            if(sum == i) {
                System.out.println(i + " -> " + sum);
                result+=sum;
            }
        }

        System.out.println(result);
    }
}
