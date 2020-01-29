package work52;

public class Task52 {
    public static void main(String[] args) {
        String s = "National Aviation University";
        String abr = String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(s.indexOf(" ")+1)) + String.valueOf(s.charAt(s.lastIndexOf(" ")+1));
        System.out.println(abr);
    }
}
