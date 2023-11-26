class Solution {
    public String frequencySort(String s) {
        int[] number = new int[128];
        for(char sh: s.toCharArray()){
            number[sh]++;
        }
        char [] ch =new char[s.length()];
        for(int i=0;i<s.length();){
            int maximum = 0;
            int idx = 0;

        for(int j=0;j<128;j++){
            if(number[j]>maximum){
                maximum = number[j];
                idx=j;
            }
        }
        while(number[idx]>0){
            ch[i++]=(char)idx;
            number[idx]--;
        }    
        }
        return new String(ch);    
    }
}