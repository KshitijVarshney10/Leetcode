class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            if(indexof(nums,-1*k)!=-1)
                return  -1*k;
        }
        return -1;
    }
    public static int indexof(int[] nums, int k){
        for(int i=0;i<nums.length;i++){
            if(k==nums[i])
                return i;
        }
        return -1;
    }
}