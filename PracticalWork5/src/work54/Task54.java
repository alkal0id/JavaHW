package work54;

public class Task54 {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        int s1len = myStr1.length();
        int i = 0;
        String res = "";
        while (i < s1len){
            String s = "" + myStr1.charAt(i);
            if (myStr2.indexOf(s) >= 0 & res.indexOf(s) == -1){
                res += s;
            }
            i++;
        }
        System.out.println(res);
    }
}
