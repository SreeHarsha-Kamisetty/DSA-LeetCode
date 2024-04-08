class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        int k = 10;
        int n = s.length();
        List<String> ans = new ArrayList<>();
        if(n == k){
           
            return ans;
        }
        for(int i=0; i<=n-k;i++){
            String sub = s.substring(i,i+k);
            map.put(sub,map.getOrDefault(sub,0)+1);
        }
        for(String a: map.keySet()){
            if(map.get(a)>1){
                ans.add(a);
            }
        }
        return ans;
    }
}