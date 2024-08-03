class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            int m=n;
            for(int j=0;j<n;j++){
                arr[i][j]=matrix[m-1][i];
                m--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=arr[i][j];
            }
        }
        
    }
}