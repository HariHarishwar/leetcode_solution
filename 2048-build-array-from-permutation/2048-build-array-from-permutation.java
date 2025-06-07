import java.util.Scanner;
class Solution {
    public int[] buildArray(int[] nums) {
        int a = nums.length;
        Scanner input = new Scanner(System.in);
        int[] arr = new int[a];
        for(int i = 0; i<a;i++){
            arr[i]=nums[nums[i]];
        }
        // for(int i=0;i<a;i++){
        //     System.out.println(arr[i]);
        // }
       return arr; 
    }
}