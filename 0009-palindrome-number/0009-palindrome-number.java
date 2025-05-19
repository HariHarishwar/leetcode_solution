class Solution {
    public boolean isPalindrome(int x) {
        int rem =0 ;
        int a=0;
        int ans=x;
       if (x < 0 || (x % 10 == 0  && x != 0)) {
            return false;
        }
        
       
        while(x!=0){
            a=x%10;
            x=x/10;
            rem=rem*10+a;
            //return true;

        }
        return ans == rem;
    }
}