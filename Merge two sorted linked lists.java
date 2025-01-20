class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node temp = null;
        
        if(head1 == null){
            return head2;
        }
        
        if(head2 == null){
            return head1;
        }
        
        if(head1.data < head2.data){
               temp = head1;
               head1 = head1.next;
               
            }else{
                temp = head2;
                head2 = head2.next;
            }
        Node newHead = temp;
        
        
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
               temp.next = head1;
               head1 = head1.next;
               
            }else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        
        if(head1 == null) temp.next = head2;
        if(head2 == null) temp.next = head1;
        
        return newHead;
    }
}
