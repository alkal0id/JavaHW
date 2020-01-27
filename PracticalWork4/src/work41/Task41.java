package work41;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double d1 = scan.nextDouble();
        System.out.println("Enter second number");
        double d2 = scan.nextDouble();
        System.out.println("Enter thurd number");
        double d3 = scan.nextDouble();
        if (d1 > d2) {
            if (d1 > d2){
                System.out.println(d1);
            }
            else {
                System.out.println(d3);
            }
        }
        else {
            if (d2 > d3){
                System.out.println(d2);
            }
            else {
                System.out.println(d3);
            }
        }
    }
}
