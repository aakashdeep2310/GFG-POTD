class Solution {
    // Function to return maximum path sum from any node in a tree.
    int maxSum = Integer.MIN_VALUE;
    
    int solve(Node node){
        if(node == null) return 0;
        int leftSum = solve(node.left);
        int rightSum = solve(node.right);
        if(leftSum > 0 && rightSum > 0) maxSum = Math.max(maxSum, node.data + leftSum + rightSum);
        else if(leftSum < 0 && rightSum < 0) maxSum = Math.max(maxSum, node.data);
        else maxSum = Math.max(maxSum, node.data + Math.max(leftSum, rightSum));
        
        return Math.max(0, node.data + Math.max(leftSum, rightSum));
        
    }
    int findMaxSum(Node node) {
        // your code goes here
        
        solve(node);
        return maxSum;
        
    }
}
