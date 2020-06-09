import java.util.Scanner;
 
public class Strin {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        int i;
        String str;
 
        str = input.nextLine();
 
        for (i = 0; i <= str.length() - 1; i++) {
            System.out.println(str.charAt(i));
        }
 
    }
 
}