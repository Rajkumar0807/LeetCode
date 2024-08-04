class Solution {
    public int titleToNumber(String ct) {
        int r = 0;
        for (int i = 0; i < ct.length(); i++) {
            r = r * 26 + ct.charAt(i) - 'A' + 1;
        }
        return r;
    }
}