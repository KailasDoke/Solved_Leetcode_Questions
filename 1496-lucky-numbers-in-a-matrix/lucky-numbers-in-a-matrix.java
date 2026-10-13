class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        HashSet<Integer> minRow = new HashSet<>();
        HashSet<Integer> maxCol = new HashSet<>();

        for(int i=0;i<row;i++){
            int minVal = mat[i][0];
            for(int j=0;j<col;j++){
                minVal = Math.min(minVal,mat[i][j]);
            }
            minRow.add(minVal);
        }
        for(int i=0;i<col;i++){
            int maxVal = mat[0][i];
            for(int j=0;j<row;j++){
                maxVal = Math.max(maxVal,mat[j][i]);
            }
            maxCol.add(maxVal);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               if(minRow.contains(mat[i][j])&&maxCol.contains(mat[i][j])){
                res.add(mat[i][j]);
               }
           
        }
        
    }
    return res;
}}