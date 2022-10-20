class Solution {
    public char findTheDifference(String s, String t) {
        int ans=0,i=0;
        for(;i<s.length();i++){
            ans+=t.charAt(i)-s.charAt(i);
        }
        ans+=t.charAt(i);
       // System.out.print(ans);
        return (char)ans; 
    }
}