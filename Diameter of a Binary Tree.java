class Solution {
    static int ans = 0;
    
    static int height(Node root){
        
        if(root == null) return 0;
        
        int leftH = height(root.left);
        int rightH = height(root.right);
        ans = Math.max(ans, leftH + rightH);
        return Math.max(leftH, rightH) + 1;
    }
    
    int diameter(Node root) {
        // Your code here
        
        ans = 0;
        height(root);
        return ans;
    }
}
