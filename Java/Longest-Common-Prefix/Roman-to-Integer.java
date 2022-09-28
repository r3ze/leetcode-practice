class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
        {
            return "";
        }
        String w = strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(w)!=0)
            {
            w=w.substring(0,w.length()-1);
            }
        }
        return w;
    }
}