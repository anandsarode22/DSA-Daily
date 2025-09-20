class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] preofProduct = new int[n];
        int [] suffofProduct = new int[n];
        int [] res = new int[n];
        
        preofProduct[0] = 1;
        for(int i=1; i<n; i++){
            preofProduct[i] = nums[i-1] * preofProduct[i-1];
        }
        suffofProduct[n-1] = 1;
        for(int j= n-2; j>=0; j--){
            suffofProduct[j] = nums[j+1] * suffofProduct[j+1]; 
        }

        for(int i=0; i<n; i++){
            res[i] = preofProduct[i] * suffofProduct[i];
        }
        return res;
    }
}