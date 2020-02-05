package work74;

import java.util.Arrays;
import java.util.Scanner;

public class Task74 {
    public static void main(String[] args) {
        System.out.println("Enter matrix size");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[][] m = createMatrix(input);
        printMatrix(m);
        transpositionMatrix(m);
        System.out.println();
        printMatrix(m);

    }

    public static void transpositionMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = i + 1; j < matrix.length; j++){
                int b = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = b;
            }
        }
    }

    public static int[][] createMatrix(int size){
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                matrix[i][j] = (int)(Math.random() * 50);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int[] arr: matrix){
            for (int i : arr){
                System.out.printf("%3d", i);
            }
            System.out.println("");
        }
    }
}
