class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int count=map.getOrDefault(nums[i],0);
            map.put(nums[i],count+1);
            
            if(map.containsKey(nums[i]) && map.get(nums[i])>nums.length/3){
                set.add(nums[i]);
            }  
        }
        for(int i:set)
            l.add(i);
        return l;
    }
}