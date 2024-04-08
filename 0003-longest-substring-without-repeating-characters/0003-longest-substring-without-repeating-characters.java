class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int end = 0;
        int start = 0;
        int maxLength = 0;
        HashMap<Character,Integer> freq = new HashMap<>();
        
        while(end < n){
            char c = s.charAt(end);
            freq.put(c,freq.getOrDefault(c,0)+1);
            while(freq.get(c)>1){
                char a = s.charAt(start);
                start++;
                freq.put(a,freq.get(a)-1);
                if(freq.get(a) == 0){
                    freq.remove(a);
                }
            }
            maxLength = Math.max(maxLength,end-start+1);
            end++;
        }
        return maxLength;
    }
}