package work53;

public class Task53 {
    public static void main(String[] args) {
        String s ="An information system is designed to collect, process, store and distribute information";
        int i = s.indexOf(" ");
        int j = s.lastIndexOf(" ")+1;
        System.out.println(s.substring(j)+s.substring(i,j)+s.substring(0,i));
    }
}
