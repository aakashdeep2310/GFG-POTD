class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int ans[] = new int[n];
        int zeros = 0;
        int total = 1;
        for(int i = 0;i<n; i++){
            if(arr[i] == 0){
                zeros++;
            }else{
                total *= arr[i];
            }
        }
        if(zeros > 1){
            return new int[n];
        }
        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                ans[i] = total;
            }else if(zeros == 1){  
                ans[i] = 0;
            }else{
                ans[i] = total / arr[i];
            }
        }
        return ans;
    }
}
