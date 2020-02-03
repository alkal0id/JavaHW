package work73;

import java.util.Arrays;
import java.util.Scanner;

public class Task73 {
    public static void main(String[] args) {
        System.out.println("Enter matrix size");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[][] m = createMatrix(input);
        printMatrix(m);
    }

    public static int[][] createMatrix(int size){
        int[][] m = new int[size][size];
        int v = 1;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                m[j][i] = v;
                v++;
            }
        }

        return m;
    }

    public static void printMatrix(int[][] matrix){
        for (int[] arr: matrix){
            System.out.println(Arrays.toString(arr));
        }
    }
}
