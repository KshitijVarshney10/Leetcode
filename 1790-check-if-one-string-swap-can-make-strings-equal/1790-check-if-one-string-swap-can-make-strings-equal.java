class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        char [] c1=s1.toCharArray();
        char [] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0; i<s1.length(); i++){
            if(c1[i]!=c2[i])
                return false;
        }
        int c=0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i))
                c++;
        }
        return c==2?true:false;
    }
}