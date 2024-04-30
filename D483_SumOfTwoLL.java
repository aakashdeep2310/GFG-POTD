public class D483_SumOfTwoLL {

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }

        public Node(Node next, int data) {
            this.data = data;
            this.next = next;

        }
    }

    public Node reverseLL(Node head) {

        Node prev = null;
        Node current = head;
        Node nextNode = null;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public Node SumOfTwoLL(Node num1, Node num2){
        

        Node temp = null;

        while(num1 != null && num1.data == 0){
            temp = num1;
            num1 = num1.next;
        }

        if(temp!= null){
            temp.next = null;
        }
        
        while(num2 != null && num2.data == 0){
            temp = num2;
            num2 = num2.next;
        }

        if(temp!= null){
            temp.next = null;
        }

        if(num1 == null && num2 == null){
            return new Node(0);
        }
        if(num1 == null){
            return num2;
        }
        if(num2 == null){
            return num1;
        }


        num1 = reverseLL(num1);
        num2 = reverseLL(num2);

        Node head1 = num1;
        Node head2 = num2;
        temp = new Node(1);
        Node ans = temp;
        int carry = 0;
        
        while(head1 != null && head2 != null){
            int sum = head1.data + head2.data + carry;
            carry = sum/10;
            temp.next = new Node(sum%10);
            temp = temp.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        
        while(head1 != null){
            int sum = head1.data + carry;
            carry = sum/10;
            temp.next = new Node(sum%10);
            temp = temp.next;
            head1 = head1.next;
            
        }
        while(head2 != null){
            int sum = head2.data + carry;
            carry = sum/10;
            temp.next = new Node(sum%10);
            temp = temp.next;
            head2 = head2.next;
        }


        
        if(carry != 0){
            temp.next = new Node(carry);
        }
        
        return reverseLL(ans.next);
    }



    public static void main(String[] args) {
        // Create linked lists
        Node l1 = new Node(0);
        l1.next = new Node(9);
        l1.next.next = new Node(1);

        Node l2 = new Node(5);
        l2.next = new Node(2);

        D483_SumOfTwoLL solution = new D483_SumOfTwoLL();
        Node result = solution.SumOfTwoLL(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }

}
