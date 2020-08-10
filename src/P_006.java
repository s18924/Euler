public class P_006 {
    public static void main(String[] args) {
        System.out.println(squareOfTheSum(100) - sumOfTheSquare(100));
    }

    private static int squareOfTheSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum * sum;
    }

    private static int sumOfTheSquare(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i * i;
        }
        return sum;
    }
}