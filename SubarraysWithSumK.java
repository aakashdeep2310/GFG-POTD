class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int totalCount = 0;
        int sum = 0;
        map.put(0,1);
        for(int i:arr){
            sum+=i;
            if(map.containsKey(sum-k)){
                totalCount += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return totalCount;
    }
}
