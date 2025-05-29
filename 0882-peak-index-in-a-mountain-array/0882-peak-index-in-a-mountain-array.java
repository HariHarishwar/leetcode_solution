class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        int target =0;
        while(start<end){
            int mid = start+(end-start)/2;
            int a=0;
            if(arr[mid]<arr[mid+1]){
               
               start=mid+1;
            }
            else  {
                end = mid;
            }

        }    
       return start;
    }
}