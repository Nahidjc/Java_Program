
import java.util.Scanner;


public class Problem2{

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int n, i, j, k;
        n = input.nextInt();
        for (i = 0; i < n; i++)
        {
            if (i % 10 == 0) 
            {
                continue;
            }
            else if(i>10)
            {
                
               j=i/10; 
               if(j%10==0)
               {
                continue;
               }
            
                else
                {
                  System.out.print(i+" ");
                }
            }
            else
                 System.out.print(i+" ");

        }
       
    }
    
}
