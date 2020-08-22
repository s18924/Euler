import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P_035 { // TODO Use sieve first, then check if they are circular
    public static void main(String[] args) {
        List<Integer> circularPrimes = new ArrayList<>();

        boolean marked[] = new boolean[1000000];
        for (int i = 2; i < 1000000; i++) {
            if(marked[i])
                continue;
            if(i%10000==0)
                System.out.println("> " + i);
            List<Integer> list = rotation(String.valueOf(i).toCharArray());
            boolean isCircularPrime = true;
            for (Integer s : list) {
                if(!isNumberPrime(s)){
                    isCircularPrime= false;
                    break;
                }
            }
            if(isCircularPrime)
                circularPrimes.addAll(list);
            for (Integer integer : list) {
                marked[integer] = true;
            }
        }

        Collections.sort(circularPrimes);
        System.out.println(circularPrimes.size());
        circularPrimes = circularPrimes.stream().distinct().collect(Collectors.toList());
        System.out.println(circularPrimes.size());
        System.out.println(circularPrimes.stream().distinct().mapToInt(Integer::intValue).sum());
    }

    private static boolean isNumberPrime(int number){
        if(number==2)
            return true;

        for (int i = 2; i <= number/2; i++) {
            if(number%i==0)
                return false;
        }

        return true;
    }


    //returns list containing all the rotation of a number: 197 -> 197,971,719
    private static List<Integer> rotation(char[] number){
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < number.length; i++) {
            char tmp = number[0];
            number = (String.valueOf(number).substring(1)+tmp).toCharArray();
            result.add(Integer.parseInt(String.valueOf(number)));
        }
        return result;
    }

}