class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>(n);
        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        for(int i = 0; i<n; i++){
           list.add(0); 
        }
        
        list.set(0,1);
        
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            int span = st.isEmpty() ? (i + 1) : (i - st.peek());
            list.set(i, span);
            st.push(i);
        }
        return list;
    }
}
