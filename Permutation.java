class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length;
        for(i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                break;
            }
        }
        if(i==-1){
            for(i=0;i<nums.length/2;i++){
                int temp=nums[i];
                nums[i]=nums[nums.length-1-i];
                nums[nums.length-1-i]=temp;
            }
        }else{
            int j=0;
            for(j=nums.length-1;j>=0;j--){
                if(nums[j]>nums[i]){
                    break;
                }
            }
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            int len=nums.length-1;i=i+1;
            while(i<=len){
                int c=nums[i];
                nums[i]=nums[len];
                nums[len]=c;
                i++;
                len--;
            }
        }
    }
}