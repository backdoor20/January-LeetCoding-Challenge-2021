class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        int rows=mat.length;
        int cols=mat[0].length;
        ArrayList<Integer> list=new ArrayList();
        for(int j=0;j<cols;j++){
            int k=j;
            list=new ArrayList();
            for(int i=0;i<rows;i++){
                if(k<cols){
                    list.add(mat[i][k]);
                    k++;
                }
            }
            k=j;
            Collections.sort(list);
           // System.out.println(list.toString());
            int tstart=0;
            for(int i=0;i<rows;i++){                
                if(k<cols&&tstart<list.size()){
                    mat[i][k]=list.get(tstart);
                    tstart++;
                    k++;
                }
            }
        }
        for(int i=0;i<rows;i++){
            int k=i;
            list=new ArrayList();
            for(int j=0;j<cols;j++){
                if(k<rows){
                    list.add(mat[k][j]);
                    k++;
                }
            }
            k=i;
            Collections.sort(list);
          // System.out.println(list.toString());
            int tstart=0;
            for(int j=0;j<rows;j++){                
                if(k<rows&&tstart<list.size()){
                    mat[k][j]=list.get(tstart);
                    tstart++;
                    k++;
                }
            }
        }
  
        
        return mat;
        
    }
}