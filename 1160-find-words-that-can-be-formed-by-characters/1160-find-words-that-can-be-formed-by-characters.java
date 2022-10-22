class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            int count=m.getOrDefault(chars.charAt(i),0);
            m.put(chars.charAt(i),count+1);
        }
        int ans=0,flag=0;
        for(int j=0;j<words.length;j++){
            String x=words[j];
            HashMap<Character,Integer> k=new HashMap<>();
            for(int i=0;i<x.length();i++){
                int count=k.getOrDefault(x.charAt(i),0);
                k.put(x.charAt(i),count+1);
            }
            for(int i=0;i<x.length();i++){
                char ch=x.charAt(i);
                if(m.containsKey(ch)==true && m.get(ch)>=k.get(ch)){
                    flag=1;
                }
                else{
                    flag=0;
                    break;
                }
            }
            if(flag!=0)
                ans+=x.length();
        }
        return ans;
    }
}