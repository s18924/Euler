import java.math.BigInteger;

public class P_014 {
    public static void main(String[] args) {

        int maxLength=0;
        for (int i = 1000000; i > 0; i--) {
            int currentLength= calculateLengthOfFunction(BigInteger.valueOf(i));
            if(maxLength < currentLength){
                maxLength = currentLength;
                System.out.println("New MaxLength: " + maxLength + " number: " + i);
            }
        }
        System.out.println(maxLength);
    }

    private static int calculateLengthOfFunction(BigInteger startingNumber){
        int numberOfIterations=1;
        while(!startingNumber.equals(BigInteger.valueOf(1))){
            if(startingNumber.mod(BigInteger.valueOf(2)).toString().equals("0"))
                startingNumber=startingNumber.divide(BigInteger.valueOf(2));
            else
                startingNumber=startingNumber.multiply(BigInteger.valueOf(3)).add(BigInteger.valueOf(1));
            numberOfIterations++;
        }
        return numberOfIterations;

    }
}

/*
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

 */
