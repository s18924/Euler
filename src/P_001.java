import java.math.BigDecimal;

public class P_001 {
    public static void main(String[] args) {
        double time = System.currentTimeMillis();

        int n = 9;


        BigDecimal no3div = new BigDecimal(Math.floorDiv(n,3));
        BigDecimal mediumValueOf3 = new BigDecimal((n/2.0)+ (3/2.0- (n%3)/2.0));
        no3div = no3div.multiply(mediumValueOf3);
        System.out.println(">" + no3div);

        BigDecimal no5div = new BigDecimal(Math.floorDiv(n,5));
        BigDecimal mediumValueOf5 = new BigDecimal((n/2.0)+ (2.5 - (n%5)/2.0));
        no5div = no5div.multiply(mediumValueOf5);
        System.out.println(">" + no5div);

        BigDecimal no15div = new BigDecimal(Math.floorDiv(n,15));
        BigDecimal mediumValueOf15 = new BigDecimal((n/2.0)+ (7.5 - (n%15)/2.0));
        no15div = no15div.multiply(mediumValueOf15);
        System.out.println(">" + no15div);


        System.out.println(
                no3div.add(no5div).add(no15div.multiply(BigDecimal.valueOf(-1))).toBigInteger()
        );


       System.out.println(System.currentTimeMillis() - time);
    }
}
