class Solution{
    public int maxLength(List<String> arr){
        return maxLength_susbq(arr,0,arr.size()-1,"");
    }
    public int maxLength_susbq(List<String> arr, int si, int ei, String ans){
        if (si>ei)
            return ans.length();
        int len=0;
        if(canConcatenate(ans,arr.get(si))) 
            len=Math.max(len,maxLength_susbq(arr, si+1, ei, ans+arr.get(si)));
        len=Math.max(len,maxLength_susbq(arr, si+1, ei, ans));
        return len;
    }
    public boolean canConcatenate(String s1, String s2){
        s1=getSorted(s1);
        s2=getSorted(s2);
        int i=0,j=0,n=s1.length(),m=s2.length();
        while(i<n && j<m){
            if(s1.charAt(i)<s2.charAt(j))
                i++;
            else if(s1.charAt(i)>s2.charAt(j))
                j++;
            else 
                return false;
        }
        return !(doesSelfHasDuplicates(s1) || doesSelfHasDuplicates(s2));
    }
    public boolean doesSelfHasDuplicates(String s){
        char prev='#';
        for(int i=0; i<s.length(); i++){
            char curr=s.charAt(i);
            if(curr==prev)
                return true;
            prev=curr;
        }
        return false;
    }
    public String getSorted(String s){
        int[] freq=new int[26];
        for (int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        String ans="";
        for(int i=0; i<26; i++){
            for(int j=0; j<freq[i]; j++){
                ans+=(char)('a'+i);
            }
        }
        return ans;
    }
}