class Solution {
    public int concatenatedBinary(int n) {
       int i=1;
        long val=0;
        while(i<=n){
            val=((val << (1+(log2(i))))%1000000007 + i)%1000000007;
            i=i+1;
        }
        return (int)(val%1000000007);
        
    }
    public int log2(int N) 
    { 
        int result = (int)(Math.log(N) / Math.log(2)); 
  
        return result; 
    } 
}