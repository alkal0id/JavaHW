package work22;

public class Task22 {
    public static void main(String[] args) {
        long ts = System.currentTimeMillis()/1000;

        long ss = ts % 60;
        ts /= 60;
        long mm = ts % 60;
        ts /= 60;
        long hh = ts % 24 +2;
        ts /= 24;
        long dd = ts;

        System.out.println(dd+":"+hh+":"+mm+":"+ss);
    }
}

