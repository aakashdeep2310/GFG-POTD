class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            int diff = target - num;

            if (hm.containsKey(diff)) {
                count += hm.get(diff);

                if (diff == num) {
                    count--;
                }
            }
        }

        return count / 2; 
    }
}
