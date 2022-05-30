import java.util.Scanner;
public class ques_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the rows : ");
        int m = in.nextInt();

        System.out.print("Enter the columns : ");
        int n = in.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];

        System.out.println("Enter first Matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter second Matrix : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = in.nextInt();
            }
        }

        System.out.println("Sum of Matrices : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("difference of Matrices : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] - arr2[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
