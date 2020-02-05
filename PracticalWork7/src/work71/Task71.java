package work71;

import java.util.Arrays;
import java.util.Scanner;

public class Task71 {

    public static void main(String[] args) {
        System.out.println("Enter array size");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[] arr = createArray(input);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] createArray(int size){
        if (size <= 0) {
            return null;
        }
        int[] arr = new int[size];
        int i = 2;
        for (int j = 0; j < arr.length; j ++){
            arr[j] = i;
            i += 2;
        }
        return arr;
    }

}
