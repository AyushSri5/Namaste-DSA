// Brute force TC: O(n) SC: O(n)
class Solution {
    public boolean isPalindrome(int x) {
        String check=String.valueOf(x);
        int i=0;
        int j=check.length()-1;
        while(i<j){
            if(check.charAt(i)!=check.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
// Optimised solution TC: O(n) SC: O(1)
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10 == 0)){
            return false;
        }

        int rev=0;
        while(x>rev){
            rev=rev*10+x%10;
            x=x/10;
        }
        return (x==rev || x==rev/10);
    }
}
