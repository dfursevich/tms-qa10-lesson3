public class Run {
    public static void main(String[] args) {
        int[] ar = new int[30];
        System.out.println(ar[9]);
        System.out.println(ar.length);
        int length = ar.length;
        System.out.println(ar[length - 1]);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        System.out.println();

        int[] b = new int[]{1, 3, 5, 3, 10};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");
        }
    }
}
