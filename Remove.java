import java.util.Arrays;
import java.util.Scanner;
public class Remove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val[] = {10, 20, 30, 40, 50};
        System.out.println("Original: " + Arrays.toString(val));
        System.out.print("Enter index to remove: ");
        int index = scanner.nextInt();
        for (int i = index; i < val.length - 1; i++) {
            val[i] = val[i + 1];
        }
        for (int i = 0; i < val.length - 1; i++) {
            System.out.print(val[i] + " ");
        }
    }
}
