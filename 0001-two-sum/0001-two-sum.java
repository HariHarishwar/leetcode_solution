class Solution {
    public int[] twoSum(int[] nums, int target) {
       // int a= 0;
        //nt b=0;
        int[] arr=new int[2];
        //int j=0;
     
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
            if( target == nums[i]+nums[j]){
                arr[0]=i;
                arr[1]=j;

            }
            if(target == nums[0]+nums[1]){
                arr[0]=0;
                arr[1]=1;
            }
            
        }
            //j++;
        
        }
        
        return arr;
    }
}
