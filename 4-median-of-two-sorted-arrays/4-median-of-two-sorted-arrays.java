class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] f=new int[nums1.length+nums2.length];
        int i=0;
        for(int j=0;j<nums1.length;j++,i++){
            f[i]=nums1[j];
        }
        for(int j=0;j<nums2.length;j++){
            f[i+j]=nums2[j];
        }
        Arrays.sort(f);
        
        if(f.length%2!=0)
            return (double)f[f.length/2];
        else
            return (double)(f[f.length/2]+f[f.length/2-1])/2;
            
    }
}