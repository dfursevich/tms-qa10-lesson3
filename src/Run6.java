public class Run6 {
    public static void main(String[] args) {
        int[] ar = new int[] {44, 26, 24, 7, 46, 27, 1, 27, 13, 24};
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length - 1 - i; j++) {
                //ar[j]
                //ar[j + 1]
                if (ar[j] > ar[j+1]) {
                    int swap = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = swap;
                }
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
