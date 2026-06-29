class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        ArrayList<List<String>> lis=new ArrayList<>();
        boolean[] isAdded=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            ArrayList<String> res=new ArrayList<>();
            if(isAdded[i]==true)continue;
            for(int j=i;j<strs.length;j++){

                if(isAnagram(strs[i],strs[j]) && isAdded[j]==false){
                    res.add(strs[j]);
                    isAdded[j]=true;
                }
               
            }
            lis.add(new ArrayList<>(res));
            
            
        }
         
        return lis;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int num:freq){
            if(num!=0)return false;
        }
        return true;
        

    }
}
