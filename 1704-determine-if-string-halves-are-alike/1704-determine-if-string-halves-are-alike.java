class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length()/2;
        String a=s.substring(0,n).toLowerCase();
        String b=s.substring(n,s.length()).toLowerCase();
        int i=0;
        int ca=0,cb=0;
        while(i<a.length()){
            if(a.charAt(i)=='a'|| a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
                ca++;
            if(b.charAt(i)=='a'|| b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u')
                cb++;
            
            i++;
        }

        return ca==cb;
    }
}