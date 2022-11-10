class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // if(nums1.length==0)
        // {
        //     if(nums2.length%2!=0)
        //     return (double)nums2[nums2.length/2];
        //     else
        //     return (double)(nums2[nums2.length/2]+nums2[nums2.length/2-1])/2;
        // }
        // if(nums2.length==0){
        //     if(nums1.length%2!=0)
        //     return (double)nums1[nums1.length/2];
        //     else
        //     return (double)(nums1[nums1.length/2]+nums1[nums1.length/2-1])/2;
        // }
        // int [] f=new int[nums1.length+nums2.length];
        // int i=0,j=0,k=0;
        // while(i<nums1.length  && j<nums1.length){
        //     if(nums1[i]<=nums2[j]){
        //         f[k]=nums1[i];
        //         k++;
        //         i++;
        //     }
        //     else{
        //         f[k]=nums2[j];
        //         j++;
        //         i++;
        //     }
        // }
        // while(i<nums1.length)
        // {
        //     f[k]=nums1[i];
        //     k++;
        //     i++;
        // }
        // while(j<nums2.length)
        // {
        //     f[k]=nums2[j];
        //     k++;
        //     j++;
        // }
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