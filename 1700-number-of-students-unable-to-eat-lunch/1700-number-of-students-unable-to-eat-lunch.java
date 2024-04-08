class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i: students){
            q.add(i);
        }
        int n = sandwiches.length;
        for(int i=n-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        int count =0;
        while(count <=1000 && !st.isEmpty()){
            while(count<=1000 && (q.peek() != st.peek())){
                int a = q.remove();
                q.add(a);
                count++;
            }
            if(q.peek() == st.peek()){
                q.remove();
                st.pop();
            }
        }
        return st.size();
    }
}