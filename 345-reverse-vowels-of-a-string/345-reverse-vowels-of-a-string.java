class Solution {
    public String reverseVowels(String s) {
       char[] st=s.toCharArray();
        int f=0;
        int e=st.length-1;
        while(f<e){
            for(;(st[f]!='a'&&st[f]!='e'&&st[f]!='i'&&st[f]!='o'&&st[f]!='u'&&st[f]!='A'&&st[f]!='E'&&st[f]!='I'&&st[f]!='O'&&st[f]!='U') &&f<e;f++);
            for(;(st[e]!='a'&&st[e]!='e'&&st[e]!='i'&&st[e]!='o'&&st[e]!='u'&&st[e]!='A'&&st[e]!='E'&&st[e]!='I'&&st[e]!='O'&&st[e]!='U')&& f<e;e--);
            
            char temp=st[f];
            st[f]=st[e];
            st[e]=temp;
            f++;
            e--;
        }
        return new String(st);
    }
}