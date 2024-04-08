class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int start = 0;
        int end = 0;
        int count = 0;
        int sum = 0;
        int temp = 0;

        while(end < nums.length){
            sum += nums[end];
            if(nums[end] == 1) temp = 0;
            if(sum > goal){
                sum -= nums[start];
                start++;
            }
            while(sum == goal && start<=end){
                temp++;
                sum -= nums[start];
                start++;
            }
            end++;
            count += temp;
        }
        return count;
    }
}