class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        
        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                int element = st.pop();
                int nse = i;
                int pse = st.isEmpty()? -1:st.peek();
                maxArea = Math.max(maxArea, arr[element] * (nse - pse -1));
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
            int nse = n;
            int element = st.pop();
            int pse = st.isEmpty()? -1 : st.peek();
            maxArea = Math.max(maxArea, arr[element] * (nse - pse - 1));
        }
        return maxArea;
    }
}
