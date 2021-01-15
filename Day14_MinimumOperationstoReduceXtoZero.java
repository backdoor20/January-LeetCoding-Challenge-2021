class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=sum(nums);
        int rem=sum-x;
        int j=0;
        int max=-1;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            while(curr>rem&&j<=i){
                curr-=nums[j];
                j++;
            }
            if(curr==rem){
                max=Math.max(max,i-j+1);
            }
        }
        if(max==-1)
            return max;
        return nums.length-max;
    }
    public int sum(int[] nums){
        int sum=0;
        for(int a:nums){
            sum+=a;
        }
        return sum;
    }
}