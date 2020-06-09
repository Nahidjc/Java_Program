
import java.util.Scanner;

public class JavaSolving {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, j = 0, k = 0;
        n = input.nextInt();
        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                j++;
            }

        }
        System.out.print("\n");
        for (i = 0; i < n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                k++;
            }

        }
        System.out.print("\n");
        System.out.println("Total even Number = " + j);
        System.out.println("Total odd Number = " + k);

    }
}
