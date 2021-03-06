public class P_012 { //TODO, MAY BE IMPROVED
    public static void main(String[] args) {

        double startTime = System.currentTimeMillis();
        boolean isNumberFound = false; //we are looking for a number having x divisors
        int triangleIndex = 2;
        int lastTriangle = 1;

        int maxDivisorNumberFound=0;


        int minutes=1;
        while(!isNumberFound){
            int triangle=lastTriangle+triangleIndex; //constructiong triagnle from previous one

          //  System.out.print(triangle + ": ");
            int numberOfDivisors=0;
            for (int i = 1; i <= triangle; i++) {
                if(triangle%i==0) {
                    numberOfDivisors++;
               //     System.out.print(i+ " ");
                }
            }
            //System.out.println();

            if(numberOfDivisors>maxDivisorNumberFound){
                maxDivisorNumberFound=numberOfDivisors;
                System.out.println("New MAX FOUND: " + maxDivisorNumberFound + " number: " + triangle + " i: " + triangleIndex);
            }

            if(numberOfDivisors>=500){
               isNumberFound=true;
                System.out.println("Triangle: " + triangle + " nod: " + numberOfDivisors);
            }

            if((System.currentTimeMillis()-startTime)/36000 > minutes){
                minutes++;
                System.out.println("Current number: " + triangle + " i: " + triangleIndex + " TIME: " + (System.currentTimeMillis()-startTime)/1000 + "s");
            }

          //  System.out.println("Triangle: " + triangle + " nod: " + numberOfDivisors);
            triangleIndex++;
            lastTriangle=triangle;
        }

    }
}

/*
Current number: 76440430 i: 12364 TIME: 2916.615s
New MAX FOUND: 576 number: 76576500 i: 12375
Triangle: 76576500 nod: 576



The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

     1: 1
     3: 1,3
     6: 1,2,3,6
    10: 1,2,5,10
    15: 1,3,5,15
    21: 1,3,7,21
    28: 1,2,4,7,14,28

We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?


 */
