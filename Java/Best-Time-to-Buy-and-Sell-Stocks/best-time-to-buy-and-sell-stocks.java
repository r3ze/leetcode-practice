class Solution {
    public int maxProfit(int[] prices) {
        int m = Integer.MAX_VALUE;
        int a = 0;
        int s = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(m>prices[i])
            {
                m=prices[i];
            }
            a = prices[i]-m;
            if(a>s)
            {
                s=a;
            }
        }
return s;
    }
}