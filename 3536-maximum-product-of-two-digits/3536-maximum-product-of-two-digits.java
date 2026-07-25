class Solution {
    public int maxProduct(int n) {
        String str = String.valueOf(Math.abs(n));
        int max = 0;
        int min = 0;
        for(char c : str.toCharArray()){
           int digit = c - '0';
           if(digit > max){
            min = max;
            max = digit;
           } else if(digit > min){
            min = digit;
           }

        }
        return max * min;
    }
}