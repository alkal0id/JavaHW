package work31;

import java.util.Scanner;

public class Task31 {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        double w = scan.nextDouble();
        int gr = (int) (w * 453.6);
        int k = (gr / 1000);
        int g = gr % 1000;
        System.out.println(k + " " + g);
    }
}