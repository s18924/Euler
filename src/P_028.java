import java.math.BigInteger;
import java.util.Arrays;

public class P_028 {
    public static void main(String[] args) {

        int sum = 0;
        int currentNumber=1;
        for (int i = 2; i < 1001; i+=2) {
            for (int j = 0; j <4; j++) {
                currentNumber+=i;
                sum+=currentNumber;
            }
        }
        System.out.println(sum+1);

        //printSnakeTable(15);

    }


    private static void printSnakeTable(int size){
        int [][] snakeTable = new int[size][size];

        fillOneCircle(snakeTable,snakeTable.length,snakeTable.length*snakeTable.length);

        for (int i = 0; i < snakeTable.length; i++) {
            for (int j = 0; j < snakeTable[i].length; j++) {
                System.out.print(snakeTable[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
    private static void fillOneCircle(int[][] table,int cirle, int currentNumber){
        int row = table.length-cirle;
        for (int i = cirle-1; i >= row ; i--)
            table[row][i] = currentNumber--;
        for (int i = row+1; i < cirle; i++)
            table[i][row] = currentNumber--;
        for (int i = row+1; i < cirle ; i++)
            table[cirle - 1][i] = currentNumber--;
        for (int i = cirle-2; i > row ; i--)
            table[i][cirle-1] = currentNumber--;

        if(cirle==table.length/2)
            return;

        fillOneCircle(table,cirle-1,currentNumber);



    }
}