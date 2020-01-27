package work32;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        System.out.println("Enter summ");
        Scanner scan  = new Scanner(System.in);
        double Summ = scan.nextInt();
        System.out.println("Enter mounth");
        int Mounth = scan.nextInt();

        Summ = Summ + Summ * 0.01 * Mounth;

        System.out.println(Summ);
    }
}