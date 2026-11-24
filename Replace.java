import java.util.Arrays;
public class Replace {
    public static void main(String[] args) {
        int count = 0;
        int val[] = {-100, 83, -7, 0, 26, 274, -67, 90, 28, 48};

        System.out.println("Original: " + Arrays.toString(val));
        for (int i = 0; i < val.length; i++) {
            if (val[i] < 0) {
                val[i] = 0;
                count++;
            }
        }
        System.out.println("Modified: " + Arrays.toString(val));
        System.out.println("Replacements: " + count);
    }
}
