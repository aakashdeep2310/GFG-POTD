public class D482_deleteEvery_kthElement {

    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
           
        }
        Node(Node next,int data) {
            this.data = data;
            this.next = next;
        }

    }
    public static void main(String[] args) {
        
    }


    public Node deleteK(Node head, int k){
        if(k==1){
            return null;
        }

        Node current = head;
        Node prev = null;
        int count = 1;

        while(current != null){
            if(count == k){
                count = 0;
                prev.next = current.next;
            }else{
                prev = current;
                count++;
                current = current.next;
            }
        }

        return head;
    }
    
}
