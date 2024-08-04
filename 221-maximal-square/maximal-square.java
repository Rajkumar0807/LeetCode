class Solution {
    public int maximalSquare(char[][] matrix) 
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int arr[][]=new int[n][m];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==0|j==0)
                {
                  arr[i][j]=matrix[i][j]-48;
                }
                else
                {
                  if(matrix[i][j]=='0')
                  {
                    arr[i][j]=0;
                  }
                  else
                  {
                    arr[i][j]=1+Math.min(arr[i-1][j],Math.min(arr[i-1][j-1],arr[i][j-1]));
                  }
                }
            }
        }
        int max=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(max<arr[i][j])
                {
                    max=arr[i][j];
                }
            }
        }
        return max*max;

    }
}