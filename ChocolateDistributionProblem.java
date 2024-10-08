class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
     
        Collections.sort(a);
        
        int i = 0;
        int j = m-1;
        long diff = 0;
        long ans = Long.MAX_VALUE;
        
        while(j < n){
            diff = a.get(j) - a.get(i);
            ans = Math.min(ans, diff);
            i++;
            j++;
        }
        return ans;
    }
}
