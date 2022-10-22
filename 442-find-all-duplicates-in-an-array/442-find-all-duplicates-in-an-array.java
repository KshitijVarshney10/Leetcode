class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        // int [] freq=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     freq[nums[i]-1]++;
        // }
        // for(int i=0;i<freq.length;i++){
        //     if(freq[i]==2)
        //         l.add(i+1);
        // }
        // return l;
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                l.add(nums[i]);
        }
        return l;
    }
}