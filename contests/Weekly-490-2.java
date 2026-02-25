// Optimised approach TC: O(log(n)) SC: O(1)
class Solution {
    public boolean isDigitorialPermutation(int n) {
        int fact[]=new int[10];
        fact[0]=1;
        for(int i=1;i<10;i++){
            fact[i]=fact[i-1]*i;
        }
        int temp=n;
        int freq[]=new int[10];
        int sum=0;
        while(temp>0){
            int mod=temp%10;
            freq[mod]++;
            sum+=fact[mod];
            temp/=10;
        }
        temp=sum;
        while(temp>0){
            int mod=temp%10;
            if(freq[mod]>0){
                freq[mod]--;
            }
            else{
                return false;
            }
            temp=temp/10;
        }
        for(int i:freq){
            if(i>0)
            return false;
        }
        return true;
    }
}
