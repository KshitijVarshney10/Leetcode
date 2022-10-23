class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(Exist(arr,i)){
                return true;
            }
        }
        return false;
    }

    private boolean Exist(int[] arr, int i){
        for(int j=0;j<arr.length;j++){
            if(i==j){
               continue;
            }
            if(arr[i]*2==arr[j] || arr[j]*2==arr[i]){
                return true;
            }
        }
        return false;
    }
}