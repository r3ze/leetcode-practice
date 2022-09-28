class Solution {
    public int reverse(int x) {

        long reverse = 0;
        while(x!=0)
        {
            reverse*=10;
            reverse+=x%10;
            x/=10;
        }
       if(reverse>=Integer.MIN_VALUE && reverse<=Integer.MAX_VALUE){ // checking
           return (int)reverse; } //Type casting
        else{
            return 0;
           }
        
    }
}