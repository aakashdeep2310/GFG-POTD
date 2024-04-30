public class D480_MergeSort_DoublyLinkedList {

    static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            next = prev = null;
        }

    }

    class Solution {
        // Function to sort the given doubly linked list using Merge Sort.
        static Node sortDoubly(Node head) {
         
            if (head == null || head.next == null) {
                return head;
            }

            Node head2 = funSplit(head);
            head = sortDoubly(head);
            head2 = sortDoubly(head2);

            return merge(head, head2);

        }

        static Node funSplit(Node head) { // use recursion to split the problem into the subproblem
            Node fast = head;
            Node slow = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node temp = slow.next;
            slow.next = null;
            if (temp != null) {
                temp.prev = null; // Update prev pointer of the new head of the second half
            }

            return temp;
        }

        static Node merge(Node head1, Node head2) {
            Node dummy = new Node(-1);
            Node curr = dummy;

            while (head1 != null && head2 != null) {
                if (head1.data < head2.data) {
                    curr.next = head1;
                    head1.prev = curr;
                    head1 = head1.next;
                } else {
                    curr.next = head2;
                    head2.prev = curr;
                    head2 = head2.next;
                }
                curr = curr.next;
            }

            if (head1 != null) {
                curr.next = head1;
                head1.prev = curr;
            }

            if (head2 != null) {
                curr.next = head2;
                head2.prev = curr;
            }
            Node ans = dummy.next;
            ans.prev = null;
            return ans;

        }
    }
}
