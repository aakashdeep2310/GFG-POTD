class Solution {
    
    public static void solve(int i, int n, char[] s, String permu, HashSet<String> st){
        if(permu.length() == n){
            st.add(permu);
            return;
        }
        
        for(int j = i; j<n; j++){
            swap(s, i, j);
            solve(i+1, n, s, permu + s[i], st);
            swap(s, i, j);
        }
    }
    
    public static void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    
    public ArrayList<String> findPermutation(String s) {
        // Code here
        
        ArrayList<String> result = new ArrayList<>();
        HashSet<String> st = new HashSet<>();
        char[] chars = s.toCharArray();
        int n = s.length();
        solve(0, n, chars, "", st);
        result.addAll(st);
        Collections.sort(result);
        return result;
    }
    
    
}
