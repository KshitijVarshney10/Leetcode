class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(exist(nums,original)){
            original*=2;
        }
        return original;
    }
    public static boolean exist(int[] a, int n){
        for(int i=0;i<a.length;i++){
            if(a[i]==n)
                return true;
        }
        return false;
    }
}