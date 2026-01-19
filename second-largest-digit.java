// Brute force TC: O(n) SC: O(n)
class Solution {
    public int secondHighest(String s) {
        int curr=-1;
        int prev=-1;
        TreeSet<Integer> hs=new TreeSet<>();
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'0';
            if(num>=0 && num<=9){
                hs.add(num);
            }
        }
        if(hs.size()<2)
        return -1;

        for(int i:hs){
            prev=curr;
            curr=i;
        }
        return prev;

        
    }
}

// Optimised version TC: O(n) SC: O(1)
    public int secondHighest(String s) {
        int first = -1, sec = -1;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i); 
            if (Character.isDigit(c)) {
                int d = c - '0';
                if (first < d) {
                    sec = first;
                    first = d;
                }else if (sec < d && d < first) {
                    sec = d;
                }
            }
        }
        return sec;
    }
