class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int candidate=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                candidate=nums[i];
            }
            if(candidate==nums[i])c++;
            else c--;

        }
        return candidate;
    }
}
