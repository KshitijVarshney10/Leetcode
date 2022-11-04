class Solution {
    public String reverseVowels(String s) {
        String vowels="";String ans="";
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            char beg=s.charAt(i);
            if(beg=='a'||beg=='A'||beg=='e'||beg=='E'||beg=='i'||beg=='I'||beg=='o'||beg=='O'||beg=='u'||beg=='U')
                vowels+=beg;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(vowels);
        sb.reverse();
        vowels=sb.toString();
        for(int i=0,j=0;i<ch.length;i++){
            char beg=ch[i];
            if(beg=='a'||beg=='A'||beg=='e'||beg=='E'||beg=='i'||beg=='I'||beg=='o'||beg=='O'||beg=='u'||beg=='U'){
                ans+=vowels.charAt(j);
                j++;
            }
            else{
                ans+=ch[i];
            }
                
        }
        return ans;
    }
}