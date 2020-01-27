package work46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int input = scan.nextInt();
        int res = 0;
        while (input / 10 > 0 | input % 10 > 0){
            res += input % 10 * input % 10;
            input /= 10;
        }
        System.out.println(res);
    }
}
