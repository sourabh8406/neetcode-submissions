class Solution {
    public double myPow(double x, int n) {
       int original = n;
       double ans = 1;
       for(int i = 0; i < Math.abs(n); i++){
        if(original < 0){
            ans = ans * 1/x;
        }
        if(original == 0){
            ans = 1;
        }
        if(original > 0){
            ans = ans * x;
        }
       }
       return ans;
    }
}
