class Solution {public void rotate(int[][] matrix) 
    {
        int  n = matrix.length;
         int  m = matrix.length;
       
        int temp[][] = new int[n][m];
        for(int i =0;i<matrix.length;i++)
        {
            for(int j =0;j<matrix[i].length;j++)
            {
                temp[i][j] = matrix[j][i];
            }
        }
         for(int i =0 ;i<matrix.length;i++)
        {
            for(int  j =0;j< matrix[i].length;j++)
            {
                matrix[i][j] = temp[i][matrix.length-j-1];
            }
        }
        if (matrix == null || matrix.length <= 1) {
        return;
}
}
}
