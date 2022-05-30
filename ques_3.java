import java.util.Arrays;
import java.util.Scanner;

public class ques_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of 1st array m: ");
        int m = in.nextInt();

        System.out.println("Enter the size of 2nd array n: ");
        int n = in.nextInt();

        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        int[] resultant = new int[m + n];

        System.out.println("Enter first array elements : ");
        for (int i = 0; i < m; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.println("Enter second array elements : ");
        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }

        System.out.print("concated array of array1 and array2 = [");
        for (int i = 0; i < m + n; i++) {
            if (i < m) {
                resultant[i] = arr1[i];
                System.out.print(" " + resultant[i]);
            } else {
                resultant[i] = arr2[i - m];
                System.out.print(" " + resultant[i]);
            }
        }
        System.out.print(" ]");
    }
}
