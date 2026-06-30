class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = s.length();
        char[] str = s.toCharArray();
        char[] rev = new char[n];
        for(int i = n-1; i >= 0; i--){
            rev[n - 1 - i] = str[i];
        }
        if(java.util.Arrays.equals(rev, str)){
            return true;
        }
        return false;
    }
}
