import java.util.*;

public class P_024 {
    private static List<String> perms = new LinkedList<>();

    public static void main(String[] args) {
        String s = "0123456789";
        permutations(s.toCharArray(), 0);
        Collections.sort(perms);
        System.out.println(perms.get(999999));
    }

    private static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    private static void permutations(char[] ch, int currentIndex) {
        if (currentIndex == ch.length - 1) {
            perms.add(String.valueOf(ch));
        }
        for (int i = currentIndex; i < ch.length; i++) {
            swap(ch, currentIndex, i);
            permutations(ch, currentIndex + 1);
            swap(ch, currentIndex, i);
        }
    }
}
/*


A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:

012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

 */