
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int n,i,v,s,t,x,y,z;
        n = input.nextInt();
         for(i=1;i<n;i++)
         {
             if(i%2==1)
             {
                 continue;
             }
             else if(i>=10 && i<100)
             {
                v=i/10;
                if(v%2==1)
                {
                    continue;
                }
                else
                {
                    System.out.print(i+" ");
                }
             }
             else if(i>=100 && i<1000)
             {
                s=i/10;
                t=s/10;
                if(s%2==1 || t%2==1)
                {
                    continue;
                }
                else
                {
                    System.out.print(i+" "); 
                }
             }
              else if(i>=1000 && i<10000)
             {
                x=i/10;
                y=x/10;
                z=y/10;
                if(x%2==1 || y%2==1||z%2==1)
                {
                    continue;
                }
                else
                {
                    System.out.print(i+" "); 
                }
             }
             else
             {
                 System.out.print(i+" "); 
             }
         }
    }
    
}
