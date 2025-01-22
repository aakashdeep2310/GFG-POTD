class Solution {
    
     static Node reverseList(Node head) {
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
    
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        
        if (num1 == null) return num2;
        if (num2 == null) return num1;

        num1 = reverseList(num1);
        num2 = reverseList(num2);
        int carry = 0;
        Node ans = new Node(0);
        Node first = ans;
        while(num1 != null || num2 != null || carry != 0){
            int sum = carry;
            
            if(num1 != null){
                sum += num1.data;
                num1 = num1.next;
            }
            
            if(num2 != null){
                sum += num2.data;
                num2 = num2.next;
            }
            
            ans.data = (sum%10);
            carry = sum/10;
            if(num1 != null || num2 != null|| carry != 0){
                ans.next = new Node(0);
                ans = ans.next;
            }
        }
        
        first = reverseList(first);
        
        while(ans.data == 0) ans = ans.next;
        return ans;
    }
}
