class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> set = new HashMap<>(); 
        int n = arr.length;
        int j = 0;
        
        for(int i = 0; i<n; i++){
            set.put(arr[i], set.getOrDefault(arr[i], 0) + 1);
            
            if(i >= k-1){
                list.add(set.size());
                set.put(arr[j], set.get(arr[j])- 1);
                if(set.get(arr[j]) == 0){
                    set.remove(arr[j]);
                }
                j++;
            }
        }
        return list;
    }
}
