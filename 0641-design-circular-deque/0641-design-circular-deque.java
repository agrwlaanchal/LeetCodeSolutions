class Node {

    public int val;
    public Node next;
    public Node prev;

    public Node(int val, Node next, Node prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}

class MyCircularDeque {

    Node head;
    Node rear; 
    int size;
    int capacity; 
    
    public MyCircularDeque(int k) {
            size=0;
            capacity=k;
    }
    
    public boolean insertFront(int value) {
        
        if(size==capacity)
            return false;
        
        if(size==0)
        {
            Node temp = new Node(value, null, null);
            head=temp;
            rear=temp;
        }else{
            Node temp = new Node(value, head, null);
            temp.next = head;
            head.prev = temp; 
            head = temp;
        }
        size++;
        return true; 
    }
    
    public boolean insertLast(int value) {
        if(size==capacity)
            return false;
        if(size==0){
            
            Node temp = new Node(value, null, null);
            head=temp;
            rear=temp;
        }else{
            rear.next = new Node(value, null, rear);
                rear = rear.next;
        }
        
        size++;
        return true; 
        
    }
    
    public boolean deleteFront() {
        
        if(size==0)
            return false;
        if(size==1){
            head=rear=null;
        }else{
            head=head.next;
        }
        size--;
        return true; 
        
    }
    
    public boolean deleteLast() {
        if(size==0)
            return false;
        if(size==1){
            head=rear=null;
        }else{
            rear=rear.prev;
        }
        size--;
        return true;
    }
    
    public int getFront() {
        if(size==0)
            return -1;
        return head.val;
    }
    
    public int getRear() {
        if(size==0)
            return -1;
        return rear.val;
    }
    
    public boolean isEmpty() {
        if(size==0)
            return true;
        return false;
    }
    
    public boolean isFull() {
        if(size==capacity)
            return true;
        
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */