class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int n = nums.length;
        int start = 0;
        int end = 0;
        int sum = 0;
        while(end < n){
            sum += nums[end];
            while(sum >= target){
                minLength = Math.min(minLength,end-start+1);
                
                sum -= nums[start];
                start++;
            }
            end++;
            
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}