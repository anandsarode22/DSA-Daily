class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n*n;
        int [] freq = new int[N + 1];
        for(int row=0; row< n; row++){
            for(int col = 0; col < n; col++){
                freq[grid[row][col]]++;
            }
        }
        int repeat = -1, miss = -1;

        for(int num=1; num <= N; num++){
            if(freq[num] == 2){
                repeat = num;
            } else if(freq[num] == 0){
                miss = num;
            }
        }
        return new int[]{repeat, miss};
    }
}