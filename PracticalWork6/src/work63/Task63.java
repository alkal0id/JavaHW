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
        int curentWord = 1;
        int spacePosition = 0;
        int size = str.length();
        int csize = size - str.lastIndexOf(" ");
        while (csize < size & spacePosition >= 0) {
            if (curentWord == numberWord){
                return str.charAt(0);
            }
            else{
                spacePosition = str.indexOf(" ");
                str = str.substring(spacePosition + 1);
                curentWord ++;
                csize += spacePosition;
            }
        }
        return 0;
    }
}
