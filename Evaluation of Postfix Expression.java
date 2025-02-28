class Solution {
    public int evaluate(String[] arr) {
        // code here
        int ans = 0;
        int num1;
        int num2;
        Stack<Integer> st = new Stack<>();
        for(String s : arr){
            if(s.equals("+")){
                num1 = st.pop();
                num2 = st.pop();
                ans = num2 + num1;
                st.push(ans);
            }else if(s.equals("-")){
                num1 = st.pop();
                num2 = st.pop();
                ans = num2 - num1;
                st.push(ans);
            }else if(s.equals("*")){
                num1 = st.pop();
                num2 = st.pop();
                ans = num2 * num1;
                st.push(ans);
            }else if(s.equals("/")){
                num1 = st.pop();
                num2 = st.pop();
                ans = num2 / num1;
                st.push(ans);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
