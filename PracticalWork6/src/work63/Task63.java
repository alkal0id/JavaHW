package work63;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();
        System.out.println("Enter number of word");
        scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        System.out.println(getFirstCharacterOfWord(inputStr, inputInt));
    }

    public static char getFirstCharacterOfWord(String str, int numberWord) {
        int i = 1;
        int j = 0;
        int size = str.length();
        int csize = size - str.lastIndexOf(" ");
        while (csize < size & j >= 0) {
            if (i == numberWord){
                return str.charAt(0);
            }
            else{
                j = str.indexOf(" ");
                str = str.substring(j + 1);
                i ++;
                csize += j;
            }
        }
        return 0;
    }
}
