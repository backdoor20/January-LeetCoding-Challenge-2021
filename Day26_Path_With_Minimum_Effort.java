class Solution {
    
    public boolean help(int i,int j,int mid,int n,int m,int[][] heights,int v[][]){
        if(i==n-1&&j==m-1) return true;
        v[i][j]=1;
        boolean op=false;
        if(i>0&&v[i-1][j]==0&&Math.abs(heights[i][j]-heights[i-1][j])<=mid){
            op=op||help(i-1,j,mid,n,m,heights,v);
        }
        if(j>0&&v[i][j-1]==0&&Math.abs(heights[i][j]-heights[i][j-1])<=mid){
            op=op||help(i,j-1,mid,n,m,heights,v);
        }
         if(i<n-1&&v[i+1][j]==0&&Math.abs(heights[i][j]-heights[i+1][j])<=mid){
            op=op||help(i+1,j,mid,n,m,heights,v);
        }
         if(j<m-1&&v[i][j+1]==0&&Math.abs(heights[i][j]-heights[i][j+1])<=mid){
            op=op||help(i,j+1,mid,n,m,heights,v);
        }
        return op;
    }
    public int minimumEffortPath(int[][] heights) {
        int s=0,e=Integer.MAX_VALUE,ans=Integer.MAX_VALUE;
        int n=heights.length,m=heights[0].length;
        while(s<=e){
            int mid=s+(e-s)/2;
            int[][] v=new int[100][100];
            for (int[] row : v) 
                Arrays.fill(row, 0);
            if(help(0,0,mid,n,m,heights,v)){
                ans=Math.min(mid,ans);
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
        
    }
}