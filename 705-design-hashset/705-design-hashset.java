class MyHashSet {
    ArrayList<Integer> l=new ArrayList<>();
    public MyHashSet() {
         
    }
    
    public void add(int key) {
        if(!l.contains(key))
            l.add(key);
    }
    
    public void remove(int key) {
        if(l.contains(key)){
            int i=l.indexOf(key);
            l.remove(i);
        }
    }
    
    public boolean contains(int key) {
        if(l.contains(key))
            return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */