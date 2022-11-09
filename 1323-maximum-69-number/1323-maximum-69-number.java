class Solution {
    public int maximum69Number (int num){
        int ans=0,temp=0;
        String s=num+"";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6' && temp==0){
                ans=(ans*10)+Integer.parseInt(String.valueOf('9'));
                temp++;
            }       
            else
                ans=(ans*10)+Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return ans;
    }
}