package work45;

import javax.swing.*;

public class Task45 {
    public static void main(String[] args) {
        System.out.println("* | 1 2 3 4 5 6 7 8 9");
        System.out.println("--------------------------------------");
        int i = 1;
        while (i <= 9){
            int j = 1;
            System.out.print(i + " | ");
            while (j <= 9){
                System.out.print(i * j + " ");
                j ++;
            }
            System.out.print("\n");
            i ++;
        }
    }
}