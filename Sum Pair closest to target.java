class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        
        List<Integer> al = new ArrayList<>();
        if(arr == null || arr.length<2){
            return al;
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int l = 0,r = arr.length-1;
        while(l<r){
            int sum = arr[l]+arr[r];
            int diff = Math.abs(target-sum);
            if(diff<min){
                min = diff;
                al = Arrays.asList(arr[l],arr[r]);
            }
            if(sum<=target){
                l++;
            }else{
                r--;
            }
        }
        return al;
    }
}
