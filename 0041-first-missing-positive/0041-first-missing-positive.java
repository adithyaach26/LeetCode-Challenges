class Solution {
    public int firstMissingPositive(int[] nums) {
        int num = 1;
        Arrays.sort(nums);
    for(int number : nums){
        if(number > 0){
            if(number == num) num ++;
            else if(number > num) break;
        }
    }
    return num;
        
    }
}