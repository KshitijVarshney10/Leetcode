class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[c]==nums[i]){}
            else{
                c+=1;
                nums[c]=nums[i];
            }
        }
        return ++c;
    }
}
