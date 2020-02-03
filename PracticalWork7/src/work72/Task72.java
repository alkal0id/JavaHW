package work72;

public class Task72 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 22, 31};
        System.out.println(sumOddElementsArray(arr));
    }

    public static int sumOddElementsArray(int[] array){
        int c = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                c ++;
            }
        }
        return c > 0 ? c : -1;
    }
}
