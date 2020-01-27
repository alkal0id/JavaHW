package work42;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number betven 0 - 9");
        int d1 = scan.nextInt();
        switch (d1) {
            case 1:
                System.out.println("Один"); break;
            case 2:
                System.out.println("Два"); break;
            case 3:
                System.out.println("Три"); break;
            case 4:
                System.out.println("Четыре"); break;
            case 5:
                System.out.println("Пять"); break;
            case 6:
                System.out.println("Шесть"); break;
            case 7:
                System.out.println("Семь"); break;
            case 8:
                System.out.println("Восемь"); break;
            case 9:
                System.out.println("Девять"); break;
            default:
                System.out.println("Другое");
        }
    }
}
