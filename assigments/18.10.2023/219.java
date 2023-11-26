class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer, Integer> MAP = new HashMap<Integer, Integer>();
        
        for (int x = 0; x<nums.length; x++) {
            if (MAP.containsKey(nums[x])) {
                
                if (x - MAP.get(nums[x]) <= k) {
                    return true;
                }
}
            MAP.put(nums[x],x);
        }
        return false;
    }
}