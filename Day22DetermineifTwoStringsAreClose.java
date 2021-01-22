class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int[] hash1=new int[26];
        int[] hash2=new int[26];
        Arrays.fill(hash1,0);
        Arrays.fill(hash2,0);
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        for(int i=0;i<ch1.length;i++){
            hash1[ch1[i]-'a']++;
            hash2[ch2[i]-'a']++;
        }
        
        System.out.println("Hello");
        for(int i=0;i<26;i++){
            if(((hash1[i]!=0)&&(hash2[i]==0))||
                (hash1[i]==0)&&(hash2[i]!=0)){
                return false;
            }
        }
        Arrays.sort(hash1);
        Arrays.sort(hash2);
        for(int i=0;i<26;i++){
            if(hash1[i]!=hash2[i]){
                return false;
            }
        }
        return true;
    }
}