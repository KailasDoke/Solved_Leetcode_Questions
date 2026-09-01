class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;
        for(int i=0;i<len;i++){
                sum = sum + mat[i][i];
                sum = sum + mat[len -1-i][i];
        }
        if(len%2 ==0){
            return sum;
        }
        return sum = sum - mat[len/2][len/2];
    }
}