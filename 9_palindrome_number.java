class Solution {
    public boolean isPalindrome(int x) {
        int cpy = x;
        int rem=0;
        int res=0;
      while(x>0)
      {
        rem = x%10;
        res = res*10+rem;
        x=x/10;
      }
      
      if(cpy==res)
      {
        return true;
      }
    return false;
    }
}