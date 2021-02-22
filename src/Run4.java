public class Run4 {
    public static void main(String[] args) {
        int[] ar = new int[] {44, 26, 24, 7, 46, 27, 1, 27, 13, 24};
        int max = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }

        System.out.println("max = " + max);
    }
}
