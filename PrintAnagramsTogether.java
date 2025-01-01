class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String, List<String>> ans = new HashMap<>();
        for(String s : arr){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sort = String.valueOf(ch);
            if(!ans.containsKey(sort)) ans.put(sort, new ArrayList());
            ans.get(sort).add(s);
        }
        return new ArrayList(ans.values());
    }
}
