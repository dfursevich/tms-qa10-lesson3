import java.util.Random;
import java.util.Scanner;

public class Run3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();

        int[] ar = new int[n];

        Random r = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = r.nextInt(50);
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
