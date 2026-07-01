class Solution {
    public void reverseString(char[] s) {
        int n = s.length;

        int start = 0;
        int end = n - 1;

        while (start < end) {
            swap(s, start, end);
            start++;
            end--;
        }
    }

    static void swap(char[] s, int index1, int index2) {
        char temp = s[index1];
        s[index1] = s[index2];
        s[index2] = temp;
    }
}