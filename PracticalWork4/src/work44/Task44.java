package work44;

public class Task44 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (i++ <= 300){
            if ( i % 3 == 0 || i % 4 == 0){
                System.out.println(i);
                j++;
            }
            if ( j >= 10){
                break;
            }
        }
    }
}
