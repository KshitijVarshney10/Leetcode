class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        int n=nums.length;
        int reqSum=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            int x=Math.abs(nums[i]);
            if(nums[x-1]<0)
                ans[0]=x;
            else
                nums[x-1]=-1*nums[x-1];
            sum+=x;
        }
        ans[1]=ans[0]-(sum-reqSum);
        return ans;
    }
}