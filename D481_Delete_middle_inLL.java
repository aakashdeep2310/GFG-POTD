public class D481_Delete_middle_inLL {

    Node head = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;

        }
    }

    public static Node deleteMiddle(Node head) {

        if(head == null || head.next == null){
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
       
      
        prev.next = slow.next;
        return head;
    }
    

}
