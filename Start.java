import java.lang.*;
import java.util.Scanner;

public class Start
{
    public static void main(String[] args) 
    {
    Scanner obj1 = new Scanner(System.in);
    int userInt = obj1.nextInt();
    if (userInt<1 || userInt>100)

        System.out.println("NO");

    else if(userInt%2!=0 || userInt==2)

        System.out.println("NO");  
    else
        System.out.println("YES");
    }    
}