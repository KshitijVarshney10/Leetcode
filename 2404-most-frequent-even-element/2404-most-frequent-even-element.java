class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int count=map.getOrDefault(nums[i],0);
                map.put(nums[i],count+1);     
            }
        }
        int maxV=-1,maxK=-1;
        for (Integer key: map.keySet()){
            int value=map.get(key);
            if(maxV<value){
                maxV=value;
                maxK=key;
            } 
            else if(maxV==value){
                maxK=Math.min(maxK,key);
            }
        }
        return maxK;
    }
}