class SmallestInfiniteSet {

    PriorityQueue<Integer> pq; 
    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();

        for(int i=1;i<10002;i++){
            pq.add(i);
        }

    }
    
    public int popSmallest() {
        if(pq.size()>0)
        return pq.poll();

        return 0;
    }
    
    public void addBack(int num) {
        
        ArrayList<Integer> arr = new ArrayList<>();
       // System.out.println(pq.size()+" "+num);
        while(!pq.isEmpty() && pq.peek()<num){
            arr.add(pq.poll());
        }

        if(pq.size()==0){
            pq.add(num);
        }else if(pq.peek()>num){
            pq.add(num);
        }

        for(int i=0; i<arr.size();i++){
            pq.add(arr.get(i));
        }

    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */