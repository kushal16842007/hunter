import java.util.*;

class ZeroMatrix{



static void ZeroMatrix(int[][] array,int n,int m)
    {
	int[][] log = new int[2][n*m];
	int k = 0 ;
	for(int i=0;i<n;i++)
        {
           for(int j=0;j<m;j++)
        {
            if(array[i][j] == 0)
		{
		log[0][k] = i;
		log[1][k] = j;
		k++;
		}
        }
        }

	for(int i=0;i<k;i++)
	{	
		int tempI = log[0][i];
		int tempJ = log[1][i];
		for(int l=0;l<m;l++)
		{
		array[tempI][l] = 0;
		}
		for(int l=0;l<n;l++)
		{
		array[l][tempJ] = 0;
		}

	}

	for(int i=0;i<n;i++)
        {
           for(int j=0;j<m;j++)
        {
           System.out.print(array[i][j]);
        }
	   System.out.print("\n");
        }
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
	int[][] array = new int[n][m];
	for(int i=0;i<n;i++)
        {
           for(int j=0;j<m;j++)
        {
            array[i][j] = scan.nextInt();
        }
        }
        ZeroMatrix(array,n,m);
       
    }               
}