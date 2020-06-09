
package pkgcatch;

/**
 *
 * @author Nahid JC
 */
public class Catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a[]={5,10};
       int b=5,c=5,n;
       
       try{
         int x=a[2]/b-a[1];
       }
       catch(Exception e)
       {
           System.out.println("Divide by zero\n"+e);
       }
       //n=a[2];
        //System.out.println(n);
       int y=a[1]/a[0];
        System.out.println("y ="+y);
    }
    
}
