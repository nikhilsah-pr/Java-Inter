import java.util.*;
public class palin
{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("enter a number");
        int n,ori;
        int rem, di=0;
        n=in.nextInt();
        ori=n;
        if(n==0 && n<0)
        {
            System.exit(0);
        }
        else
        {
            
            while(n!=0)
            {                      
                    rem=n%10;
                    di = di*10 + rem;
                    n=n/10;    
            }

        }
        if(ori==di)
            System.out.println("Number is palindrome number");
        else
            System.out.println("Not a Plaindrome number");
         
    }
    
}
