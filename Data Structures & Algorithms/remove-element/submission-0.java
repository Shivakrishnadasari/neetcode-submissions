class Solution {
    public int removeElement(int[] nums, int val) {
        int start=0;
        int count=0;
        for(int next=0;next<nums.length;next++){
           
            if(nums[next]!=val ){
                nums[start]=nums[next];
                
                start++;
            }
        }
             
        return start;
    }
}