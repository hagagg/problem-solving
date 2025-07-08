class Solution {
    public int lengthOfLastWord(String s) {
        s= s.trim();
        int startIndex = s.lastIndexOf (' ') + 1;
        s= s.substring (startIndex);

        return s.length();
    }
}
