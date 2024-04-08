class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int one_count =0;
        int zero_count =0;
        for(int i: students){
            if(i==1) one_count++;
            else zero_count++;
        }
        for(int i: sandwiches){
            if(i == 1){
                if(one_count >0){
                    one_count--;
                }
                else{
                    return zero_count;
                }
            }
            else{
                if(zero_count >0){
                    zero_count--;
                }
                else{
                    return one_count;
                }
            }
        }
        return 0;
    }
}