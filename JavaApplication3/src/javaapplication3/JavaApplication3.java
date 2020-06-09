
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        int j;
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) 
        {
            for(j=i;j<N;j++)
            {
               System.out.print(" ");  
            }
            for (j = 0; j<=i ; j++) 
            {
                System.out.print("*");
            }
            System.out.print("\n");

        }

    }

}
