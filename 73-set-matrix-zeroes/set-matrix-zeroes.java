class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[] k=new boolean[m];
        boolean[] p=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    k[i]=true;
                    p[j]=true;
                }
            }
        }
        //for row = 0;
        for(int i=0;i<m;i++){
            if(k[i]==true){
                for(int j=0;j<n;j++){
                    matrix[i][j]=0;
                }
            }
        }
        //for col=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(p[j]==true){
                    matrix[i][j]=0;
                }
            }
        }        
    }
}