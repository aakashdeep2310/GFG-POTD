class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
    
     int n  = arr.length, r=0;
     for(int i=0;i<n-2;i++){
         int l = i+1,ri=n-1;
         while(l<ri){
            int sum  = arr[i]+arr[l]+arr[ri] ;
            if(sum<target){
                l++;
            }
            else if(sum>target){
                ri--;
            }
            else{
                if(arr[l]==arr[ri]){
                    int count = ri-l+1;
                    r+=count*(count-1)/2;
                    break;
                }else{
                    int cnt1=1,cnt2=1;
                    while(l+1<ri && arr[l]==arr[l+1]){
                        l++;
                        cnt1++;
                    }
                    while(ri-1>l && arr[ri] == arr[ri-1]){
                        ri--;
                        cnt2++;
                    }
                    r+=cnt1*cnt2;
                    l++;
                    ri--;
                }
            }
         }
     }
     return r;
    }
}
