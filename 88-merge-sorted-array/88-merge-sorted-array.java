class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            
            if(nums1[i]<=nums2[j]){
                ans[k]=nums1[i];
                i++;
                k++;
            }
            else{
                ans[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            ans[k]=nums1[i];
            i++;
            k++;
        }
        while(j<=n-1){
            ans[k]=nums2[j];
            j++;
            k++;
        }
        for(int l=0;l<nums1.length;l++){
            nums1[l]=ans[l];
        }
    }
}