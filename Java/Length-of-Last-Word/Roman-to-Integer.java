class Solution {
    public int lengthOfLastWord(String s) {
     String[]ss = s.split(" ");
        String word = ss[ss.length-1];
        return word.length();
    }
}