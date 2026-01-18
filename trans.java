import java.util.*;
public class trans
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of");
        int arr[][]={{5,6,8,8},{4,6,2,7},{6,3,9,1}};
        System.out.println("Diagonal Elements");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(i==j)
                {
                    System.out.print(arr[i][j]+" , ");
                }
            }
            System.out.println();
        }
    }
}