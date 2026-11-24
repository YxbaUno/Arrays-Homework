public class Largest {
    public static void main(String[] args) {
        int val[] = {10, 36, 76, 20, 5, -7, 0};
        int largest1 = val[0];
        int largest2 = 0;

        for (int i = 0; i < val.length; i++) {
            if (val[i] > largest1) {
                largest1 = val[i];
            }
        }
        int have = 0;
        for (int i = 0; i < val.length; i++) {
            if (val[i] < largest1) {
                if (have == 0 || val[i] > largest2) {
                    largest2 = val[i];
                    have++;
                }
            }
        }
        System.out.println("Largest: " + largest1);
        if (have == 0) {
            System.out.println("No second largest distinct number.");
        } else {
            System.out.println("Second largest: " + largest2);
        }
    }
}
