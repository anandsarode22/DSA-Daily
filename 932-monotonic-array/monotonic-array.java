class Solution {
    public boolean isMonotonic(int[] nums) {
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         } else if (nums[i] <= nums[j]){
        //             return true;
        //         } else if (nums[i] >= nums[j]){
        //             return true;
        //         }
        //     }
            
        // }
        // return false;

        if(nums.length <= 1){
            return true;
        }

        boolean increasing = true;
        boolean decreasing = true;

        for(int i=0; i<nums.length -1; i++){

            if(nums[i] > nums[i+1]){
                increasing = false;
            }
            if(nums[i] < nums[i+1]){
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }
}