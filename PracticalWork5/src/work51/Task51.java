package work51;

import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int slen = input.length();
        System.out.println(input.substring(slen/2));
    }
}
