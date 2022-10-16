class Solution {
    public int findLucky(int[] arr) {
        int max=0;  
        int n=arr.length;
        boolean visited[]=new boolean[n];
        Arrays.fill(visited, false);
        for (int i=0; i<n; i++){
            if(visited[i]==true)
            continue;
            int count=1;
            for (int j=i+1; j<n; j++) {
                if (arr[i]==arr[j]) {
                    visited[j]=true;
                    count++;
                }
            }
            if(arr[i]==count && max<arr[i])
                max=arr[i];
        }
        if(max==0)
            return -1;
        return max;
    }
}