import java.util.ArrayList;
import java.util.List;

public class Recurring_characters {
    public static void main(String[] args) {

        String input = "abc";

        List<String> characters = new ArrayList<>();
        for (String s : input.split("")) {
            if (characters.contains(s)) {
                System.out.println(s);
                return;
            }
            characters.add(s);
        }
    }
}

/*
Phone task from google, find first occurnig recurring character in a string
 */