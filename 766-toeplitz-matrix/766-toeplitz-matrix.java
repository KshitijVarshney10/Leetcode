class Solution {
    public boolean isToeplitzMatrix(int[][] matrix){
        for(int r=0; r<matrix.length; ++r)
            for(int c=0; c<matrix[0].length; ++c)
                if(r>0 && c>0 && matrix[r-1][c-1]!=matrix[r][c])
                    return false;
        return true;
        
//         boolean [][] visited=new boolean[matrix.length][matrix[0].length];
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 int r=i,c=j;
//                 if(!visited[i][j]){
//                     visited[i][j]=true;
//                     while(r<matrix.length && c<matrix[0].length && !visited[r][c]){
                        
//                         if(matrix[r][c]==matrix[i][j]){
//                             visited[r][c]=true;
//                             r=i+1;
//                             c=j+1;
//                         }
//                         else
//                             return false;  
//                     }
//                 }
//                 // else
//                 //     continue;
//             }
//         }
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 System.out.print(visited[i][j]+" ");
//             }
//             System.out.println();
//         }
//         return true;
    }
}