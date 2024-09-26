class Pair{
    int start;
    int end;
    Pair(int s, int e){
        start=s;
        end =e;
    }
    
}



class MyCalendar {

    ArrayList<Pair> arr; 
    public MyCalendar() {
            
        arr = new ArrayList<>();
        
        
    }
    
    public boolean book(int start, int end) {
       
            
            for(Pair p: arr){
                
                
                if(Math.max(p.start, start)<Math.min(p.end, end)){
                    return false;
                }
            }   
        
        arr.add(new Pair(start,end));
        return true; 
            
            
        }
        
        
    
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */