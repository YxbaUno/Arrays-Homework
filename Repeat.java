
public class Repeat {
    public static void main(String[] args) {
        int val[] = {10, 33, 7, 10, -7, 89, 272, 7, 282, 89};
        for (int i = 0; i < val.length; i++) {
            for (int j = i + 1; j < val.length; j++) {
                if (val[i] == val[j]) {
                    int detect = 0;
                    for (int l = 0; l < i; l++) {
                        if (val[l] == val[i]) {
                            detect++;
                        }
                    }
                    if (detect == 0) {
                        System.out.print(val[i] + ", ");
                    }
                }
            }
        }
    }
}
