class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        
        
        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
            int end=nums.length-1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while(start<end){
                
                int sum=nums[start]+nums[end];
                if(sum==-nums[i]){
                ArrayList<Integer> list=new ArrayList<>();
               
                
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    
                    res.add(new ArrayList<>(list));
                    start++;
                    end--;
            while (start < end && nums[start] == nums[start - 1]) {
    start++;
}

while (start < end && nums[end] == nums[end + 1]) {
    end--;
}
                }
                else if(sum<-nums[i])start++;
                else end--;

            }
        }
        
        
        return res;
        
    }
}
