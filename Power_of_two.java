// Brute force TC: O(log(n)) SC: O(1)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
        return true;
        if(n==0 || n<0)
        return false;
        while(n>0){
            if(n!=1 && n%2==1)
            return false;
            n/=2;
        }
        return true;
    }
}
// Optimised approach TC : O(1) SC: O(1)
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}
