class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int a:nums){
            if(map.containsKey(k-a)&&map.get(k-a)>0){
                map.put(k-a,map.get(k-a)-1);
                count++;
            }else{
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }
        return count;
    }
}