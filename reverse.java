import  java.util.*;
public class reverse
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("enter a number");
        int n;
        int rem, di=0;
        n=in.nextInt();
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
        System.out.println("Reverse : "+ di);

    }
}