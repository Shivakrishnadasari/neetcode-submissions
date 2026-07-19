class Solution {
    public String mergeAlternately(String word1, String word2) {
       int a=0;
       int b=0;
       StringBuilder sb=new StringBuilder();
       while(a<word1.length() && b<word2.length()){
            sb.append(word1.charAt(a));
            sb.append(word2.charAt(b));
            a++;
            b++;
       }
       while(a<word1.length()){
        sb.append(word1.charAt(a));
        a++;
       }
       while(b<word2.length()){
        sb.append(word2.charAt(b));
        b++;
       }
       return sb.toString();
    }
}