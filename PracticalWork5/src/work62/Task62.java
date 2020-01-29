package work62;

import java.util.Scanner;

public class Task62 {
    public static void main(String[] args) {
        System.out.println("Enter number (min 2 digits)");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(latestDigit(input));
    }

    public static String latestDigit(int number){
//        return String.valueOf(number%10) + String.valueOf(number%100/10);
        String s = String.valueOf(number);
        return String.valueOf(s.charAt(s.length()-1)) + String.valueOf(s.charAt(s.length()-2));
    }
}
