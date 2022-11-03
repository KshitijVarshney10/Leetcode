class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int count=map.getOrDefault(nums[i],0);
            map.put(nums[i],count+1);
        }
        int j=0;
        for(Integer key: map.keySet()){
            Integer value=map.get(key);
            System.out.print(key+" "+value+"    ");
            while(value>0){
                nums[j]=key;
                j++;
                value--;
            }
        }
    }
}