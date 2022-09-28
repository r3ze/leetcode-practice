class Solution {
       public int reverse(int x)
    {
        int rev=0;
        while(x>0)
        {
            rev*=10;
            rev+=(x%10);
            x/=10;
        }
        return rev;
    }
    public boolean isPalindrome(int x) {
        return(reverse(x)==x);

    }
}