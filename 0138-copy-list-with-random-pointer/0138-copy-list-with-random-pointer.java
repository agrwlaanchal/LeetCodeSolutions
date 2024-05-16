/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head==null){
            return null; 
        }
        Node temp = null;
        Node next=null;
        
        Node curr=head;
        while(curr!=null ){
            
            next = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = next;
            curr= next; 
        }
        
        curr=head;
        while(curr!=null){
           if(curr.random!=null)
            curr.next.random = curr.random.next;
            curr = curr.next.next; 
        }
        
        
          Node original = head, copy = head.next;  
  
    // save the start of copied linked list  
    temp = copy;  
  
    // now separate the original list and copied list  
    while (original != null && copy != null)  
    {  
        original.next = (original.next != null)?  
                    original.next.next : original.next;  
  
        copy.next = (copy.next != null) ? copy.next.next  
                                            : copy.next;  
        original = original.next;  
        copy = copy.next;  
    }  
    return temp;
        
    }
}