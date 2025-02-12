class Solution {
    
    static List<Integer> list;
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        list = new ArrayList<>();
        order(root);
        if(k> list.size() || k<=0){
            return -1;
        }else{
            return list.get(k-1);
        }
    }
    
    
    public static void order(Node root){
        if(root == null) return;
        
        order(root.left);
        list.add(root.data);
        order(root.right);
    } 
}
