class Solution {
    //method to rotate
    public void rotate(int[][] mat){
        int r = mat.length;
        int c = mat[0].length;
        for(int i=0;i<r;i++){
            for(int j =i;j<c;j++){
                int tem = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=tem;
            }
        }

        //revers
        for(int i=0;i<c;i++){
            int left =0;
            int right = c -1;
            while(left<right){
                int tem = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right]=tem;
                left++;
                right--;
            }
        }
    }

    //method for match
    public boolean compare(int[][] mat , int[][] target){
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
      int r = mat.length;
      int c = mat[0].length;

        for(int i=0;i<4;i++){
            // compare mat 
            if(compare(mat , target)){
                return true;
            }
            rotate(mat);
        }  
        return false;
    }
}