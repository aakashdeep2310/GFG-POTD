class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        
        int n = s.length();
        int maxLen = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            while (set.contains(currentChar)) {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(currentChar);
            maxLen = Math.max(maxLen, i - j + 1);
        }
        
        return maxLen;
    }
}
