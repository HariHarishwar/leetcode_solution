class Solution {
    public int[] runningSum(int[] nums) {
        int a = nums.length;
        int[] arr= new int[a];
        arr[0]=nums[0];
        for(int i=1;i<a;i++){
            arr[i]=arr[i-1]+nums[i];
          //  j
        }
      return arr;  
    }
}