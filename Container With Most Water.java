class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int n = arr.length;
        int minValue = Integer.MAX_VALUE;
        int ans = 0;
        int dist = 0;
        
        int i = 0; 
        int j = n-1;
        
        while(i<j){
            dist = j-i;
            minValue = Math.min(arr[i], arr[j])*dist;
            ans = Math.max(ans, minValue);
            
            if(arr[i] < arr[j]){
                i++;
            }else{
                j--;
            }
            
        }
        return ans;
    }
}
