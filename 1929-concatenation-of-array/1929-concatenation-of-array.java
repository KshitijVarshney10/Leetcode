class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        //int c=0;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
//         for(int i=0;i<nums.length;i++,c++)
//             ans[c]=nums[i];
        
        return ans;
    }
}