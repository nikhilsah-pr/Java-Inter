import java.util.*;
public class arr0
{
    public static void main(String args [])
    {
        Scanner in =new Scanner (System.in);
        int n,i;
        int x=0,y=0;
        System.out.println("Enter Size of array");
        n=in.nextInt();
        int arr[]=new int[n];
        int num[]=new int[n];
        int zer[]=new int[n];
        
       
        System.out.println("Enter elements in array");
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Your original array");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" , ");
        }
        System.out.println();
        System.out.println("Your original array with - (Move All Zeros to the End)");
        for(i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                 num[x]=arr[i];
                 x++;
            }
   
            else
            {
                 zer[y]=arr[i];
                 y++;
            }
               
        }
        for(i=0;i<x;i++)
        {
            System.out.print(num[i]+" , ");
        }
        for(i=0;i<(n-x);i++)
        {
            System.out.print(zer[i]+" , ");
        }

    }
}
