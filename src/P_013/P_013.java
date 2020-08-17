package P_013;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class P_013 {

    public static void main(String[] args) {

            try {
                List<String> numbers = Files.readAllLines(Paths.get("src/P_013/numbers.txt"));
                BigInteger sum = new BigInteger("0");
                for (String number : numbers) {
                    sum = sum.add(new BigInteger(number));
                }
                System.out.println(sum);
            } catch (IOException e) {
                e.printStackTrace();
            }



    }



}
