class Solution {
    public int numSpecial(int[][] mat) {
        int [] rowArr = new int[mat.length];
        int [] colArr = new int[mat[0].length];
        
        //fill rowArr, colArr
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    rowArr[i]++;
                    colArr[j]++;
                }
                
            }
        }
        
        int ans = 0;
        //find special position
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1 && rowArr[i] == 1 && colArr[j] == 1){
                    ans++;
                }
            }
        }
        return ans;
    }
}