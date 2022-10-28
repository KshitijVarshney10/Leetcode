class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0; i<n; i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            
            String s=String.valueOf(ch);
            
            if(!map.containsKey(s))
                map.put(s,new ArrayList<String>());
            map.get(s).add(strs[i]);
        }
        //System.out.println(map.values());
        ArrayList<List<String>> ans=new ArrayList<List<String>>();
        ans.addAll(map.values());        
        return ans;
    }
}


