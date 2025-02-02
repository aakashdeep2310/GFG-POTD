class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            ArrayList<Integer> currentLevel = new ArrayList<>();
            
            Node node = queue.poll();
            
            currentLevel.add(node.data);
            
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
            
            res.add(currentLevel);
        }
        return res;
    }
}
