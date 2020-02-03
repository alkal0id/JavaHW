package work75;

import java.util.Arrays;
import java.util.Scanner;

public class Task75 {
    public static void main(String[] args) {
        System.out.println("Enter strinf of digits 1 - 9");
        Scanner scan = new Scanner(System.in);
        String numbers = scan.nextLine();
        System.out.println(Arrays.toString(countOfSequenceNumbers(numbers)));
    }

    public static int[] countOfSequenceNumbers(String numbers){
        int[] arr = new int[9];
        for (int i = 0; i < numbers.length(); i++){
            int j = Integer.parseInt(String.valueOf(numbers.charAt(i)));
            arr[j-1] += 1;
        }
        return arr;
    }
}
