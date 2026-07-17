class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9')sb.append(s.charAt(i));
        }
        int a=0;
        int b=sb.length()-1;
        while(a<b){
            if(sb.charAt(a)!=sb.charAt(b))return false;
            a++;
            b--;
        }
        return true;
    }
}
