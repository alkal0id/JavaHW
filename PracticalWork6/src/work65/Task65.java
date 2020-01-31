package work65;

import java.util.Scanner;

public class Task65 {
    public static void main(String[] args) {
        System.out.println("Enter height pyramid");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        printPyramid(input);
    }
    public static void printPyramid(int height) {
        int i = 1;
        int weight = height - 1;
        while (i <= height) {
            int j = 0;
            int k = 1;
            while (j < weight){
                if (weight -j - i >= 0) {
                    System.out.print(" ");
                }
                else{
                    System.out.print(k);
                    k ++;
                }
                j ++;
            }
            j = 0;
            k = i;
            while (j <= weight){
                if ( j >= i ) {
                    System.out.print(" ");
                }
                else{
                    System.out.print(k);
                    k --;
                }
                j ++;
            }
            i ++;
            System.out.print("\n");

        }
    }
}
