import java.util.Random;

public class Run2 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(10);
        System.out.println("a = " + a);

        //[-5; 5)
        int b = r.nextInt(10) - 5;
        System.out.println("b = " + b);
    }
}
