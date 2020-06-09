
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k, i,total;

        n = input.nextInt();
        k = input.nextInt();
        if (n % 10!= 0) 
        {

            for (i=1;i<=k;i++)
            {
                n = n - 1;
            }
            total=n/10;
        System.out.println(total);
        }
        
        else
        {
                total=n/10;
        System.out.println(total);
                }
    }
}
