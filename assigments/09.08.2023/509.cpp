class Solution {
public:
    int fib(int n) {
        int sum=0;
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
};