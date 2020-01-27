package work33;

public class Task33 {
    public static void main(String[] args) {
        double price = 830.0;
        int p1 = 13;
        int p2 = 7;
        double op1 = price - price * p1 /100;
        System.out.println(op1);
        double op2 = op1 + op1 * p2 /100;
        System.out.println(op2);

        System.out.println(830.0*0.87*1.07);
    }
}
