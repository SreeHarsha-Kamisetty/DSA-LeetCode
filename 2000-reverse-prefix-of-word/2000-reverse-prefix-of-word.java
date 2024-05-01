class Solution {
    public String reversePrefix(String word, char ch) {
        int index = -1;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(c == ch){
                index = i;
                break;
            }
        }
        if(index == -1) return word;
        
        StringBuilder ans = new StringBuilder();
        
        for(int i=0; i< word.length();i++){
            if(i <= index){
                ans.append(word.charAt(index-i));
            }
            else{
                ans.append(word.charAt(i));
            }
        }
        return ans.toString();
    }
 
}