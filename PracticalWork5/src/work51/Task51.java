package work51;

import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        System.out.println("Enter triangle side");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double res = areaTriangle(a, b, c);
        System.out.println(res);
    }

    public static double areaTriangle(double a, double b, double c) {
        double p = (a + b + c) /2;
        double summ = 0;
        if (a >= p || b >= p || c >= p){
            System.out.println("This is not triangle");
        }
        else {
            summ = Math.sqrt(p*(p - a)*(p - b)*(p - c));
        }
        return summ;
    }
}
