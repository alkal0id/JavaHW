package work55;

import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String res = "";
        int slen = s.length();
        int i = 0;
        while (i < slen) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                res += s.charAt(i);
            }
            i++;
        }
        System.out.println(res);
    }
}
