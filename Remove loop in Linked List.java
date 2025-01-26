class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        if(fast == null || fast.next == null) return;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        Node newLoop = slow;
        Node temp = newLoop;
        while(temp.next != newLoop) temp = temp.next;
        temp.next = null;
    }
}
