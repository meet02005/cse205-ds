class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] fin = new int[nums.length+1]; 
       for(int x : nums) 
           fin[x]++;  
        int In1 = 0 ; int In2 = 0 ; 
       for (int x =1 ;x <fin.length; x++) { 
           if (fin[x] == 2)
               In1 = x; 
           if(fin[x] == 0) 
               In2 = x;
       }
     return new int[] {In1,In2};
    }
}