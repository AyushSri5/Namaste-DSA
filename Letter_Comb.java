// Optimised approach TC: O(4^N) SC: O(N)
class Solution {
    public List<String> letterCombinations(String digits) {
        letter(digits,"");
        return ans;
    }
    List<String> ans=new ArrayList<>();
     String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
    public void letter(String digits,String temp){
        if(digits.length()==0){
            ans.add(temp);
            return;
        }
        char ch=digits.charAt(0);
        String t=map[ch-'0'];
        for(int i=0;i<t.length();i++){
        letter(digits.substring(1),temp+t.charAt(i));
        
        }
    }
}
