package work46;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int input = scan.nextInt();
        input = input < 0 ? -input : input;
//        if (input < 0){
//            input = -input;
//        }
        int res = 0;
        while (input > 0){
            res += input % 10 * input % 10;
            input /= 10;
        }
        System.out.println(res);
    }
}
