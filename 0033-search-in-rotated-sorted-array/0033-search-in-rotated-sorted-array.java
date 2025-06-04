class Solution {

    public int search(int[] nums, int target) {
    int start =0 ;
        int end= nums.length-1;
        int ans =0;
        while(start<end){
            int mid = start+(end-start)/2;
           if(mid <end && nums[mid]>nums[mid+1]){
               ans= mid;
           }
           if(mid>start && nums[mid]<nums[mid-1]){
               ans= mid -1;
           }
           if(nums[mid]<=nums[start]){
               end= mid-1;
           }else{
                start= mid+1;
           }

         // ans=start;
        }

        int result = search(nums, target, ans);
        if(result!=-1){
            return result;
        }else{
            return decsearch(nums,target,ans);
        }
}
static int search(int[] nums , int target, int a ){
        int start = a+1;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (nums[mid] == target) return mid;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]) {
                end = mid - 1;
            }
        }
          return -1;
    }
    static int decsearch(int[] nums , int target, int a ){
        int start = 0;
        int end = a;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (nums[mid] == target) return mid;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
        }
        return -1;
    }
}
