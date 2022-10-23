class Solution {
    public boolean checkIfExist(int[] arr) {
        
        for(int i=0; i<arr.length; i++){
            int d=2*arr[i];
            int ind=indexof(arr,d);
            if(ind!=-1 && i!=ind){
                System.out.print(ind+" "+i);
                return true;
            }
                
        }
        return false;
    }
    public static int indexof(int[] arr,int d){
        for(int i=0;i<arr.length; i++){
            if(arr[i]==d)
                return i;
        }
        return -1;
    }
}