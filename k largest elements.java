class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        
       PriorityQueue<Integer> minHeap  = new PriorityQueue<>();
        int n = arr.length;
   
        for(int num : arr){
            minHeap.offer(num);
            if(minHeap.size() > k){
                minHeap.poll();   
            }
        }
        ArrayList<Integer> list = new ArrayList<>(minHeap);
        list.sort(Collections.reverseOrder());
        return list;
        
    }
}
