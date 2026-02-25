// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public String maximumXor(String s, String t) {
        int count0=0;
        int count1=0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='0'){
                count0++;
            }
            else{
                count1++;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                if(count1>0){
                    ans.append("1");
                    count1--;
                }
                else{
                    ans.append("0");
                    count0--;
                }
            }
            else{
                if(count0>0){
                    ans.append("1");
                    count0--;
                }
                else{
                    ans.append("0");
                    count1--;
                }
            }
        }
        return ans.toString();
    }
}
