// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
   Iterator<Integer> iterator;
    Integer buffer ; 
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
/*        arr = new ArrayList<>();
        while (iterator.hasNext()) {
            arr.add(iterator.next());
        }*/
        this.iterator = iterator;
        buffer = iterator.hasNext() ? iterator.next() : null;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
       
      return buffer; 
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
       
        int num = buffer;
        buffer = iterator.hasNext() ? iterator.next() : null;
        return num;
	    
	}
	
	@Override
	public boolean hasNext() {
	    
       return buffer != null;
        
        
	}
}