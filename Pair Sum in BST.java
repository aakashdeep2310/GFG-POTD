class Solution {
    static List<Integer> list;
    boolean findTarget(Node root, int target) {
        // Write your code here
        
        list = new ArrayList<>();
        inorder(root);
        int n = list.size();
        
        int left = 0; int right = n-1;
        while(left < right){
            int sum = list.get(left) + list.get(right);
            if(sum == target) return true;
            else if(sum < target) left++;
            else right--;
        }
        
        return false;
    }
    
    public static void inorder(Node root){
        if(root == null) return;
        
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }
}
