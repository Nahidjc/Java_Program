
import java.util.Scanner;

public class Arry {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, sum = 0, mul = 1, n, j, t = 0;

        n = input.nextInt();
       int a [];
        a = new int[n];
        for (j = 0; j < n; j++) {
            a[j] = input.nextInt();
        }

        for (j = 0; j < n; j++) {
            if (a[j] % 2 == 0) {
                sum = sum + a[j];
            } else if (a[j] % 2 == 1) {
                mul = mul * a[j];
                t++;

            } else {
                mul = 0;
            }

        }
        System.out.println("sum of even number =" + sum);
        if (t > 0) {
            System.out.println("multiplication of odd number =" + mul);

        } else {
            mul = 0;
            System.out.println("multiplication of odd number =" + mul);
        }

    }

}
