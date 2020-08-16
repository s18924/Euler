package P_022;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P_022 {
    public static void main(String[] args) {
        try {
            String names = Files.readString(Paths.get("src/P_022/p022_names.txt"));

            List<String> namesList = Arrays.asList(names.replaceAll("\"","").split(","));

            Collections.sort(namesList);
            System.out.println(namesList.get(937));
            System.out.println(938*sumChars(namesList.get(937)));

            int sum = 0;

            for (int i = 0; i < namesList.size(); i++)
                sum+=(i+1)*sumChars(namesList.get(i));

            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int sumChars(String name){
        int sum=0;
        for (char c : name.toCharArray())
            sum+=c-'A'+1;

        return sum;
    }
}

/*
Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
begin by sorting it into alphabetical order. Then working out the alphabetical value for each name,
multiply this value by its alphabetical position in the list to obtain a name score.
For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53,
is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
What is the total of all the name scores in the file?
 */
