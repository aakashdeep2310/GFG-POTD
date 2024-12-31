class Solution {
    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        
        Arrays.sort(arr);
        int n = arr.length;
        int currLength = 1;
        // int maxLength = 1;
        int maxLength = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i] == (arr[i-1]+1)){
                currLength++;
            }else{
                
                maxLength = Math.max(maxLength, currLength);
                currLength = 1;
            }
        }
        maxLength = Math.max(maxLength, currLength);
        return maxLength;
       
    }
}
