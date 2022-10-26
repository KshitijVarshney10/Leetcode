class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=words.length;
        for(int i=0;i<words.length;i++){
            int ans=0;
            String a=words[i];
            while(a!=""){
                if(!allowed.contains(String.valueOf(a.charAt(0)))){
                    ans++;
                }
                a=a.substring(1,a.length());
            }
            if(ans>0)
                count-=1;
        }
        return count;
    }
}