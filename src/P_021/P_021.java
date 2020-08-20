package P_021;

public class P_021 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i < 10000; i++) {
            sum+=isNumberAmicable(i);
        }

        System.out.println(sum);
    }

    private static int isNumberAmicable(int number){ //return number if its Amicable or 0 if it's not
        int sum=0; //sum of base number divisiors
        for (int i = 1; i < number; i++) {
            if(number%i==0)
                sum+=i;
        }

        if(sum==number)
            return 0;

        int sumOfSumDivisiors = 0;
        for (int i = 1; i < sum; i++) {
            if(sum%i==0)
                sumOfSumDivisiors+=i;
        }

        return number == sumOfSumDivisiors ? number : 0 ;
    }

}
