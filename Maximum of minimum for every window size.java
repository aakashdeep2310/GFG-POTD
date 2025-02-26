class Solution {
    private int[] getThePreviousSmallElement(int[] arr, int n){
    
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int[] prevSmaller = new int[n];
        
        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                prevSmaller[i] = st.peek();
            }else{
                prevSmaller[i] = -1;
            }
            st.push(i);
        }
        return prevSmaller;
    }
    
    private int[] getTheNextSmallElement(int[] arr, int n){
        ArrayDeque <Integer> st = new ArrayDeque<>();
        int[] nextSmaller = new int[n];
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            
            if(!st.isEmpty()){
                nextSmaller[i] = st.peek();
            }else{
                nextSmaller[i] = n;
            }
            st.push(i);
        }
        return nextSmaller;
    }
    
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // Your code 
        
        int n = arr.length;
        int[] prevSmaller = getThePreviousSmallElement(arr, n);
        int[] nextSmaller = getTheNextSmallElement(arr, n);
        
        
        int[] ans = new int[n];
        
        for(int i = 0; i<n; i++){
            int windowSize = nextSmaller[i] - prevSmaller[i] -1;
            int num = Math.max(ans[windowSize - 1], arr[i]);
            ans[windowSize -1] = num; 
        }
        
        for(int i = n-2; i>= 0; i--){
            int num = Math.max(ans[i], ans[i+1]);
            ans[i] = num;
        }
        
        ArrayList<Integer> win = new ArrayList<>();
        for(int it : ans){
            win.add(it);
        }
        
        return win;
    }
}
