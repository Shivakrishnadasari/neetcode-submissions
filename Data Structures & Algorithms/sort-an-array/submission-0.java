class Solution {
    public int[] sortArray(int[] nums) {
        int start=0;
        int end=nums.length-1;
        sort(nums,start,end);
        return nums;
    }
    public void sort(int[] nums,int start,int end){
        int mid=start+(end-start)/2;
        if(start>=end)return ;
        
        sort(nums,start,mid);
        sort(nums,mid+1,end);
        merge(nums,start,mid,end);
    }
    public void merge(int[] nums,int start,int mid,int end){
        int n=nums.length;
        int ls=mid-start+1;
        int rs=end-mid;
        int[] arr1=new int[ls];
        int[] arr2=new int[rs];
        for(int i=0;i<ls;i++){
            arr1[i]=nums[start+i];
        }
        for(int i=0;i<rs;i++){
            arr2[i]=nums[i+mid+1];
        }

        int s1=0;
        int s2=0;
        int k=start;
        while(s1<arr1.length && s2<arr2.length){
            if(arr1[s1]<=arr2[s2]){
                nums[k]=arr1[s1];
                s1++;
                k++;
            }else{
                nums[k]=arr2[s2];
                s2++;
                k++;
            }
        }
        while(s1<arr1.length){
            nums[k]=arr1[s1];
                s1++;
                k++;
        }
        while(s2<arr2.length){
            nums[k]=arr2[s2];
                s2++;
                k++;
        }
        
    }
}