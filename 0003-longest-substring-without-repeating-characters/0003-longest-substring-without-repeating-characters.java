class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        int start =0;
        int end = 0;
        while(end<n){
            hm.put(s.charAt(end),hm.getOrDefault(s.charAt(end),0)+1);
            while(hm.get(s.charAt(end))>1){
                hm.put(s.charAt(start),hm.get(s.charAt(start))-1);
                start++;
            }
            max = Math.max(max,end-start+1);
            
            end++;
        }
        return max;
    }
    public static int check(String sub){
        HashMap<Character,Integer> hm = new HashMap<>();
        int n = sub.length();
        for(int i=0;i<n;i++){
            hm.put(sub.charAt(i),hm.getOrDefault(sub.charAt(i),0)+1);
        }

        return hm.size()==n?hm.size():0;
    }
}