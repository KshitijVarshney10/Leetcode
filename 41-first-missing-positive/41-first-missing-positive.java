class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                set.add(nums[i]);
        }
        // System.out.println(set);
        for(int i=1;i<=set.size();i++){
            if(!set.contains(i))
                 return i;
        }
        return set.size()+1;
        
        
//         int sum=0;
//         int c=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>0){
//                 sum+=nums[i];
//                 c++;
//             }
//         }   
//         int k=Math.abs((c*(c+1)/2)-sum);
//         return k==0?c+1:k;
        
    //     int i=1;
    //     while(true){
    //         if(index(nums,i)==-1)
    //             break;
    //         i++;
    //     }
    //     return i;
    // }
    // public static int index(int[] nums, int k){
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==k)
    //             return i;
    //     }
    //     return -1;
    }
}