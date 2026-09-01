class Solution {
    public int missingNumber(int[] nums) {
        int num = 0;
        Arrays.sort(nums);
        for(int number : nums){
                if(number == num) {
                    num ++;
                }else if(number > num){
                    break;
                }
            
        }return num;
    }
}