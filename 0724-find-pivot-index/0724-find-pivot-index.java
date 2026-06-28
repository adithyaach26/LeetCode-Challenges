class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        int target = 0;
        for(int num : nums){
            target += num;
        }
        int rightsum = 0;
        for(int i = 0; i < nums.length; i++){
            rightsum = target - leftsum - nums[i];
            if(leftsum == rightsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}