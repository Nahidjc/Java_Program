package stringproblem;

import static java.lang.System.in;
import java.util.Scanner;

public class StringProblem {

    public static void main(String[] args) {
        int l, i, n = 0, j;
        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
       
        l = str.length();
        for (i = 0; i < l; i++)
        {
            for (j = n; j < l; j++)
            {
                if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z')
                {
                    if (j == n)
                    {
                        System.out.print( Character.toUpperCase(str.charAt(j)));
                    } else
                    {
                        System.out.print(str.charAt(j));
                    }

                }
              else  if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z')
                {
                    if (j == n) 
                    {
                        System.out.print(str.charAt(j));
                    } 
                    else 
                    {
                        System.out.print( Character.toUpperCase(str.charAt(j)));
                    }

                 }
                else
                  System.out.print(str.charAt(j));
           
        }
         System.out.print("\n");     
 n++;
    }

}
}
