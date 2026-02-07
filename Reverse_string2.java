// Optimised approach TC: O(n) SC: O(1)
class Solution {
    public String reverseStr(String s, int k) {
        char arr[]=s.toCharArray();
        int i=0;
        while(i<s.length() && (i+k)<=s.length()){
            swap(arr,i,i+k-1);
            i+=2*k;
        }
        String ans="";
        for(int j=0;j<arr.length;j++){
            ans+=arr[j];
        }
        return ans;
    }
    public void swap(char arr[],int i,int j){
        int a=i;
        int b=j;
        while(a<b){
            char temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
}
