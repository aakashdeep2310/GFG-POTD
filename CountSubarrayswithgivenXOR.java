class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        int pXor = 0;
        hm.put(0, 1);

        for (int i : arr) {
            pXor ^= i; 

            int rXor = pXor ^ k;
            if (hm.containsKey(rXor)) {
                count += hm.get(rXor);
            }
            hm.put(pXor, hm.getOrDefault(pXor, 0) + 1);
        }

        return count;
    }
}
