class MyHashMap {
    int[] myhashmap;
    int length = 0;
    public MyHashMap() {
      length = 1000001;
      myhashmap = new int[length];
    }
    
    public void put(int key, int value) {
      myhashmap[key] = value+1;  
    }
    
    public int get(int key) {
        return myhashmap[key]-1;
    }
    
    public void remove(int key) {
        myhashmap[key] = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */