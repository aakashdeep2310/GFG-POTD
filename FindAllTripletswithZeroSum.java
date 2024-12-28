class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        
          int n = arr.length;
        Map<Integer, List<int[]>> pairSums = new HashMap<>();
        Set<List<Integer>> resultSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                pairSums.computeIfAbsent(sum, k -> new ArrayList<>())
                        .add(new int[]{i, j});
            }
        }

        for (int i = 0; i < n; i++) {
            int target = -arr[i];
            if (pairSums.containsKey(target)) {
                for (int[] pair : pairSums.get(target)) {
                    if (pair[0] != i && pair[1] != i) {
                        List<Integer> triplet = Arrays.asList(i, pair[0], pair[1]);
                        Collections.sort(triplet); 
                        resultSet.add(triplet);
                    }
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>(resultSet);
        result.sort((a, b) -> {
            for (int k = 0; k < 3; k++) {
                if (!a.get(k).equals(b.get(k))) {
                    return a.get(k) - b.get(k);
                }
            }
            return 0;
        });

        return result;
    }
}
