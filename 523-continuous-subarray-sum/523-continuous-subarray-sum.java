class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
         Map<Integer, Integer> map=new HashMap<>(Map.of(0,0));
        int sum=0;
        for (int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(!map.containsKey(sum%k))      //if the remainder sum % k occurs for the first time
                map.put(sum%k, i+1);
            else if(map.get(sum%k)<i)        //if the subarray size is at least two
                return true;
        }
        return false;
    }
}