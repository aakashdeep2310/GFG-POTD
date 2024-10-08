class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int sum = 0;
        int len = 0;
        int minLen = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowEnd = 0;
        int n = arr.length; 
        
        while(windowEnd < n){
            //expansion
            sum += arr[windowEnd];
            if(sum>x){
                len = windowEnd - windowStart + 1;
                minLen = Math.min(minLen, len);
             while(windowStart<windowEnd && sum > x){
                 sum -= arr[windowStart];
                 windowStart++;
                 if(sum>x){
                    len = windowEnd - windowStart + 1;
                    minLen = Math.min(minLen, len);
                 }
             }
            }
            windowEnd++;
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
