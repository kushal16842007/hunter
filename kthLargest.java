import java.util.Scanner;
public class kthLargest {
static int kthLargest(int[] array,int n,int k)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(array[i]<array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
       
        return array[n-k];
    }
public static void main(String[] arg)
{
    int n,k;
     Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
     k = scan.nextInt();
    int[] array = new int[n];
   for(int i=0;i<n;i++)
   {
       array[i] = scan.nextInt();
   }
   System.out.print(kthLargest(array,n,k));
    
    
}
    
}
