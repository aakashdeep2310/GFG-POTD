class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(n, -1));
        Deque<Integer> st = new ArrayDeque();
        
       
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                list.set(i, st.peek());
            }
            st.push(arr[i]);
        }
        return list;
    }
}
