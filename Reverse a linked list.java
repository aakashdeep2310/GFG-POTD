class Solution {
    Node reverseList(Node head) {
        // code here
        
        if(head ==  null || head.next == null){
            return head;
        }
        
       Node prev = null;
       Node curr = head;
       
       while(curr != null){
           Node nextAdd = curr.next;
           curr.next = prev;
           prev = curr;
           curr = nextAdd;
       }
       return prev;
    }
}
