class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        
        if(k==0) return head;
        int len = 1;
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
            len++;
        }
        k= k%len;
        if(k == 0) return head;
        temp.next = head;
        Node newTail = head;
        for(int i = 1; i<k; i++) newTail = newTail.next;
        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
