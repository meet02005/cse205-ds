class MyHashSet {
    List<Integer> myhashmap;
    public MyHashSet() {
      myhashmap = new ArrayList<>();
    }
    
    public void add(int key) {
        if (!myhashmap.contains(key)) {
            myhashmap.add(key);
        }
    }
    
    public void remove(int key) {
        if (myhashmap.contains(key)) {
            myhashmap.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        return myhashmap.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */