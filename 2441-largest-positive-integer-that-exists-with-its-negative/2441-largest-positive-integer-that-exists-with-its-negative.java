class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,1);
        }
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            if(map.containsKey(-i)){
                max = Math.max(max,i);
            }
        }
        return max != Integer.MIN_VALUE ? max : -1;
    }
}