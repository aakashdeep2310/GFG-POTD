class Solution {
    
    static ArrayList<Integer> list;
    
    // Function to check whether a Binary Tree is BST or not.
   static  void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }
    
    
    boolean isBST(Node root) {
        // code here.
        list = new ArrayList<>();
        inorder(root);
        for(int i = 0; i<list.size()-1; i++){
            if(list.get(i) > list.get(i+1)) return false;
        }
        return true;
    }
}
