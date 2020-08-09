public class P_005 {
    public static void main(String[] args) {
        int result=20;
        boolean isDividable;
        do {
            isDividable = true;
            result++;
            for (int i = 1; i <= 20; i++)
                if (result % i != 0) {
                    isDividable = false;
                    break;
                }
        } while (!isDividable);
        System.out.println(result);
    }
}
