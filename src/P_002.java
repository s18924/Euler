public class P_002 {
    public static void main(String[] args) {

        double time = System.currentTimeMillis(); //Time check

        int val1 = 1; //"left" Fibo value
        int val2 = 2; //"right" Fibo value
        int tmp;
        int sum = 0; //Even sum
        while (val2 < 4000000) {
//            if ( (val2%2) == 0) { //If last bit equals 0, then number is even
            if ((val2 & 0b1) == 0) { //If last bit equals 0, then number is even
                sum += val2; //so we are adding sum
            }
            tmp = val1;
            val1 = val2;
            val2 += tmp;
        }

        System.out.println(System.currentTimeMillis() - time);
        System.out.println(sum);

    }
}
