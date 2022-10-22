class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length() || s.length()==0 || t.length()==0){
            return "";
        }
        Map<Character,Integer> dictionary=new HashMap<>();
        for(int i=0;i<t.length();i++){
            int count=dictionary.getOrDefault(t.charAt(i),0);
            dictionary.put(t.charAt(i),count+1);
        }
        
        int reqSize=dictionary.size();
        
        int l=0,r=0;
        int formed=0;  //how many uniqueCharacters in t are present in current window.
        Map<Character,Integer> windowCount=new HashMap<>();
        int ans[]={-1,0,0};
        
        while(r<s.length()){
            char c=s.charAt(r);
            int count=windowCount.getOrDefault(c,0);
            windowCount.put(c,count+1);
            
            if(dictionary.containsKey(c) && windowCount.get(c).intValue()==dictionary.get(c).intValue())
                formed++;
            
            while(l<=r && formed==reqSize){
                c=s.charAt(l);
                if(ans[0]==-1 || r-l+1<ans[0]){
                    ans[0]=r-l+1;
                    ans[1]=l;ans[2]=r;
                }
                windowCount.put(c,windowCount.get(c)-1);
                if(dictionary.containsKey(c) && windowCount.get(c).intValue()<dictionary.get(c).intValue())
                    formed--;
                
                l++;
            }
            r++;
        }
        if(ans[0]==-1)
            return "";
        return s.substring(ans[1],ans[2]+1);
    }
}