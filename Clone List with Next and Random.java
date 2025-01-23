class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
       Map<Node, Node> node = new HashMap<>();
        Node dummy = new Node(0);
        Node curr = head;
        Node currClone = dummy;
        while(head != null){
            Node clone = new Node(head.data);
            currClone.next = clone;
            node.put(head, clone);
            currClone = clone;
            head = head.next;
        }
        Node clone = dummy.next;
        while(curr != null){
            if(curr.random != null){
                clone.random = node.get(curr.random);
            }
            clone = clone.next;
            curr = curr.next;
        }
        return dummy.next;
    }
}
