// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    ArrayList<Integer> arr ; 
    int index =0; 
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        arr = new ArrayList<>();
        while (iterator.hasNext()) {
            arr.add(iterator.next());
        }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(arr.size()>0){
            return arr.get(index);
        }
        return -1;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int num = arr.get(index);
        index++;
        return num;
	}
	
	@Override
	public boolean hasNext() {
	    
        if(index<arr.size()){
            return true;
        }
        return false; 
        
	}
}