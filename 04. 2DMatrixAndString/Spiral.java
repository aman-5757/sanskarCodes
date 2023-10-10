public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        int minr = 0, maxr = matrix.length-1;
        int minc = 0, maxc = matrix[0].length-1;
        
        int t = matrix.length * matrix[0].length;   //total elements
        int c = 0;                                  //printed count
        
        while(c < t){
            for(int col = minc; col <= maxc && c < t; col++){
                ans.add(matrix[minr][col]);
                c++;
            }
            minr++;
            for(int row = minr; row<=maxr && c < t; row++){
                ans.add(matrix[row][maxc]);
                c++;
            }
            maxc--;
            for(int col = maxc; col >= minc && c < t; col--){
                ans.add(matrix[maxr][col]);
                c++;
            }
            maxr--;
            for(int row = maxr; row >= minr && c < t; row--){
                ans.add(matrix[row][minc]);
                c++;
            }
            minc++;
        }
        return ans;
        
    }