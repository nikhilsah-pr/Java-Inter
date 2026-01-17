import java.util.*;

public class sort 
{
    public static void main(String []args)
    {
        Scanner in = new Scanner (System.in); 
        int n,i;
        System.out.println("Enter Size of array");
        n=in.nextInt();
        int arr[]=new int[n];
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
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Second Highest Array's Element");     
        System.out.print(arr[((arr.length)-2)]);
        
        
    }
    
    
}
