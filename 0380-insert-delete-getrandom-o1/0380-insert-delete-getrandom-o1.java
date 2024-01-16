class RandomizedSet {

    HashSet<Integer> hset;
    public RandomizedSet() {
     hset = new HashSet<>();
        
    }
    
    public boolean insert(int val) {
        
        if(!hset.contains(val)){
            hset.add(val);
                return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        
        if(hset.contains(val)){
            hset.remove(val);
            return true;
        }
        return false;
        
    }
    
    public int getRandom() {
        List<Integer> list = new ArrayList<>(hset);
        
        int len = hset.size();
        int randomIndex = (int)(Math.random()*len);
        return list.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */