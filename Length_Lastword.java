// Brute Force TC: O(n) SC: O(n)
class Solution {
    public int lengthOfLastWord(String s) {
     String check=s.trim();
     String arr[]=check.split(" ");
     int max=0;
     for(int i=arr.length-1;i>=0;i--){
        if(!arr[i].isEmpty()){
            return arr[i].length();
        }
     }
     return -1;   
    }
}
// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
         s=s.trim();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
               break;
            }
            count++;
        }
        return count;
    }
}
