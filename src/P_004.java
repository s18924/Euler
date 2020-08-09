public class P_004 {
    public static void main(String[] args) {
        int maxnum = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int num = i*j;
                maxnum = isPalindrome(num) ? (num > maxnum ? num : maxnum) : maxnum;
            }
        }
        System.out.println(maxnum);
    }

    static boolean isPalindrome(int number){
        String stringNum = String.valueOf(number);
        for (int i = 0; i < stringNum.length()/2; i++) {
            if (stringNum.charAt(i) != stringNum.charAt(stringNum.length()-1-i))
                return false;
        }
        return true;
    }
}
