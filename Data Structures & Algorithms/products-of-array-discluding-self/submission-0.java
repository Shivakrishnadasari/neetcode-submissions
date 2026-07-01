class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prod1=1;
        int[] pref=new int[n];
        for(int i=0;i<n;i++){
            pref[i]=prod1;
            prod1=prod1*nums[i];
        }
        int prod2=1;
        int[] suff=new int[n];
        for(int i=n-1;i>=0;i--){
            suff[i]=prod2;
            prod2=prod2*nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=pref[i]*suff[i];
        }
        return nums;
    }
}  
