class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int[] arr=new int[k];
        int rem=nums.length-k;
        Stack<Integer> stack=new Stack();
        for(int i=0;i<nums.length;i++){
            while(stack.size()>0&&rem!=0&&nums[i]<stack.peek()){
                stack.pop();
                rem--;
            }
            stack.push(nums[i]);
        }
        while(rem!=0){
            stack.pop();
            rem--;
        }
        for(int i=k-1;i>=0;i--){
            arr[i]=stack.pop();
        }
        return arr;
    }
}