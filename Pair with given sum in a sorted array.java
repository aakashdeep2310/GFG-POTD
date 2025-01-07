class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int c = target - num;

            if (map.containsKey(c)) {
                count += map.get(c);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
