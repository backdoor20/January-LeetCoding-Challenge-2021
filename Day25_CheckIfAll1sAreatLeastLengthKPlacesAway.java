class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        if(k==0)
            return true;
        int temp=-1;
        for(int a:nums){
            if(temp==-1&&a==1){
                temp=0;
            }else if(a==1){
                if(k<=temp){
                    temp=0;
                }else
                    return false;
            }else if(temp!=-1){
                temp++;
            }
        }
        return true;
    }
}