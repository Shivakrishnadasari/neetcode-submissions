class Solution {
    public void reverseString(char[] s) {
        int a=0;
        int b=s.length-1;
        while(a<b){
            swap(s,a,b);
            a++;
            b--;
        }
    }
    public void swap(char[] s,int a , int b){
        char c=s[a];
        s[a]=s[b];
        s[b]=c;
    }
}