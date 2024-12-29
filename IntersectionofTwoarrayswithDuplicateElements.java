class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>(); 
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        
        for (int num : a) {
            hs1.add(num);
        }

        for (int num : b) {
            hs2.add(num);
        }
        
        for (int i : hs1) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        for (int i : hs2) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue() == 2){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
