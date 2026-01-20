// Brute Force TC: O(n) SC: O(n)
class Solution {
    public int reverse(int x) {
        String rev="";
        
        rev=rev+String.valueOf(Math.abs(x));
        StringBuilder sb=new StringBuilder(rev);
        sb.reverse();
        String ans=sb.toString();
        if(x<0)
        ans="-"+ans;
        int val=0;
        try{
         val=Integer.valueOf(ans);
        }
        catch(Exception err){
            return 0;
        }
        return (Integer.valueOf(ans)>=(-1*(int)Math.pow(2,31)) && Integer.valueOf(ans)<(int)Math.pow(2,31)-1) ? Integer.valueOf(ans) : 0;
    }
}
// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (
                rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && pop > 7)
            ) return 0;
            if (
                rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && pop < -8)
            ) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
