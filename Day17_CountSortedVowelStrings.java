class Solution {
    char[] ch=new char[]{'a','e','i','o','u'};
    int count=0;
    public int countVowelStrings(int n) {
        bt(n,0);
        return count;
        }
    public void bt(int n,int lastchar){
        if(n==0){
            count++;
            return;
        }
        for(int i=0;i<ch.length;i++){
            if(i>=lastchar)
            bt(n-1,i);
        }
    }
}