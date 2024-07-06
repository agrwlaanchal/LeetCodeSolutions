/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        
        //count the nodes first
        // figure out each array index size 
        // maybe hashmap for list and size. 
        // traverse the list 
        
        int count =0;
        ListNode temp = head;
      
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        int commoncount = count/k;
        int extranodeindex = count%k;
        
    //    System.out.println(count+" "+commoncount+" "+extranodeindex);
        
        ListNode[]res= new ListNode[k];
        temp=head;
        
        for(int i=0;i<extranodeindex;i++){
            
            int size = commoncount+1;
            int c=1;
                
            res[i]=temp;
            while(c<size){
                c++;
                if(temp!=null)
                temp=temp.next; 
                else
                    break;
            }
            
            if(temp==null)
            break; 
            
            ListNode t = temp.next; 
            temp.next = null;
            temp = t;
            
            
        }
        
        if(temp==null)
            return res; 
        
        for(int i=extranodeindex;i<k;i++){
            
            int size = commoncount;
            int c=1;
                
            res[i]=temp;
            while(c<size){
                c++;
                if(temp!=null)
                temp=temp.next; 
                else
                    break;
            }
            
            if(temp==null)
            break;
            ListNode t = temp.next; 
            temp.next = null;
            temp = t;
            
            
        }
        return res; 
        
        
        
        
       /* ArrayList<ArrayList<ListNode>> arr = new ArrayList<>();
       
        for(int i=0;i<k;i++){
            arr.add(new ArrayList<ListNode>());
        }
        
        ListNode curr =head;
        
        
        while(curr!=null){
            
            for(int i=0;i<k;i++){
                arr.get(i).add(new ListNode(curr.val));
                curr = curr.next;
                if(curr==null){
                    break;
                }
            }
           // curr=curr.next;
            
        }
        
        ListNode[] res = new ListNode[k];
        
        for(int i=0;i<arr.size();i++){
            
            ListNode temp = null;
            ListNode q = null;
            ArrayList<ListNode> t = arr.get(i);
            for(ListNode l:t){
                if(temp==null){
                    temp=l;
                    q=l;
                }else{
                    q.next = l;
                    q=q.next;
                }
            }
            res[i]=temp;
            
        }
        return res;*/
        
        
    }
}