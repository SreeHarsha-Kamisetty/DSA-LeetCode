class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];

            if(map.containsKey(comp)){
                answer[0] = i;
                answer[1] = map.get(comp);
            }
            else{
                map.put(nums[i],i);
            }
        }
        return answer;
    }
}