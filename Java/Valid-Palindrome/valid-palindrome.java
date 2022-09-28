class Solution {
    public boolean isPalindrome(String s) {
        String w = "";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))){
                w+=s.charAt(i);
            }
        }
        String ww="";
        for(int i=w.length()-1;i>=0;i--)
        {
            ww+=w.charAt(i);
        }
     
        String a = w.toLowerCase();
        String b = ww.toLowerCase();
           System.out.println(a);
        System.out.print(b);
        return a.equals(b);
    }
}