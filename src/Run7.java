import java.util.Arrays;

public class Run7 {
    public static void main(String[] args) {
        int[] ar = new int[] {44, 26, 24, 7, 46, 27, 1, 27, 13, 24};

        Arrays.sort(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        System.out.println();
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + " ");
        }
    }
}
