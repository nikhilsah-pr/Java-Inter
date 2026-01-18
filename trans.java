import java.util.*;
public class trans
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j;
        int arr[][]={{5,6,8,8,4},{4,6,2,7,1},{6,3,9,1,2}};
        System.out.println("OG Array");
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.print(arr[i][j]+" , ");
            }
            System.out.println();
        }
        System.out.println("Diagonal Elements");
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(i==j)
                    System.out.print(arr[i][j]);
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}