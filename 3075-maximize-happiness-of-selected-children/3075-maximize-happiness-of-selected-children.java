class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long maxHappiness = 0;
        int index =0;
        int count =0;
        Arrays.sort(happiness);
        reverse(happiness);
         System.out.println(happiness[index]);
        while(k-->0){
            if(happiness[index] >0){
               
                happiness[index] -= count;
                
            }
             if(happiness[index] >0){
               
                maxHappiness += happiness[index];
                
            }
           
            index++;
            count++;
            
        }
        return maxHappiness;
    }
    public static void reverse(int[] arr){
        
        int l =0;
        int r =arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}