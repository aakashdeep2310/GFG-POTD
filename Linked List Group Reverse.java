class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if(head == null) return head;
        Node curr = head, prev = null, next = curr.next;
        int count = 0;
        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        
        if(next != null){
            head.next = reverseKGroup(next, k);
        }
        return prev;
    }
}
