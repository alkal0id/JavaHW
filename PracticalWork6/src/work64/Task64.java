package work64;

import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(convertDecimalToBinary(input));
    }

    public static String convertDecimalToBinary(int number){
        String res = "";
        while (number > 0){
            res = number % 2 + res;
            number = number / 2;
        }
        return res;
    }
}
