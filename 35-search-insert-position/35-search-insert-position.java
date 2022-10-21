class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0, u=nums.length;
        while(l<u){
            int mid=l+(u-l)/2;
            if(nums[mid]>target)
                u=mid;
            else if(nums[mid]<target)
                l=mid+1;
            else
                return mid;
        }
        return l;
    }
}