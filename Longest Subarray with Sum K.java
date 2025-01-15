class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        
        int n = arr.length;
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            sum += arr[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }
            if(!map.containsKey(sum)){
             map.put(sum, i);
            }
            if(map.containsKey(sum-k)) {
                maxLen = Math.max(maxLen, i-map.get(sum-k));
            }
        }
        
        return maxLen;
    }
}
