public class ques_1b {
    public static void main(String[] args) {

        int result = 1, rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int s = 1; s < rows - i; s++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0) {
                    result = 1;
                } 
                else {
                    result *= (i - j + 1) / j;
                }
                System.out.printf("%4d", result);
            }
            System.out.println();
        }

    }
}
