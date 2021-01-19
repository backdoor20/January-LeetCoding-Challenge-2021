class Solution {
    public String longestPalindrome(String s) {
       int n=s.length();
        boolean[][] table =new boolean[n][n];
        
        int maxLength=1;
        int start=0;
        for(int i=0;i<n;i++){
            table[i][i]=true;
        }
        
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                table[i][i+1]=true;
                start=i;
                maxLength=2;
            }
            
        }
        
        for(int k=3;k<=n;k++){
            for(int i=0;i<n-k+1;i++){
                int j=i+k-1;
                if(table[i+1][j-1]&&s.charAt(i)==s.charAt(j)){
                    table[i][j]=true;
                    if(k>maxLength){                        
                    start=i;
                    maxLength=k;
                    }
                }
            }
        }
        
        return s.substring(start,start+maxLength);
        
    }
    
    
}