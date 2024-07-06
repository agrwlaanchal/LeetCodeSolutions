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
        
        //first add one node after each node 
        
        if(head==null){
            return null; 
        }
        
        Node temp=head;
        while(temp!=null){
            //save the next
            Node next = temp.next; 
            Node t = new Node(temp.val);
            t.next = temp.next ; 
            temp.next = t; 
            temp=t.next;
        }
        
        temp=head;
        
        while(temp!=null){
            
            Node t = temp.random;
            if(t!=null)
            temp.next.random = t.next; 
            else
                temp.next.random = null;
            
            temp=temp.next.next; 
            
        }
        
       Node res= null;
       temp = head;
        Node t = null;
         while(temp!=null){
             if(res==null){
                 res=temp.next;
                 t=res;
             }else{
                 t.next = temp.next;
                 t=t.next;
             }
             temp.next = temp.next.next;
             temp=temp.next;
             
             
         }
        
        return res; 
    }
}