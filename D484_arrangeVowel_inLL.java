import org.w3c.dom.Node;

public class D484_arrangeVowel_inLL {
     public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        
        Node current = head;
        Node vowel = new Node('a');
        Node con = new Node('b');
        
        Node vowelH = vowel;
        Node conH = con;

        
        while(head != null){
            int ch = head.data;
            
            if(ch =='a' || ch =='e' ||ch =='i' ||ch =='o' ||ch =='u'){
                vowel.next = head;
                vowel = vowel.next;

            }else{
                con.next = head;
                con = con.next;
            }
            
            head = head.next;

        }
        
        con.next = null;
        vowel.next = conH.next;
        return vowelH.next;
    }
    
}
