class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[n];
        int[] b =new int[n];
        int c=0;
    
        int k=0;
        int m=1;
        int[] arr =new int[nums.length];
        for(int i=0; i<n;i++){
            a[i]=nums[i];
        }
        for(int i=n;i<nums.length;i++){
            b[c]=nums[i];
            c++;
        }
        
        for(int i=0;i<n;i++){
           arr[k]=a[i];
           arr[m]=b[i];
           k=k+2;
           m=m+2;

               
            
        }
        
        return arr;
    }
}