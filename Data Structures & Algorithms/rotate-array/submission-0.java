class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        rev(nums , 0 , n-k-1);
        rev(nums , n-k , n-1);
        rev(nums , 0 , n-1);
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void rev(int[] arr, int start, int end){
        while(start<end){
        swap(arr,start,end);
        start++;
        end--;
        }
    }
}