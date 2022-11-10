class Solution {
    public int canBeTypedWords(String text, String brokenLetters){
        String[] words=text.split(" ");
        int ans=0;
        if(brokenLetters.equals(""))
            return words.length;
        for(int i=0;i<words.length;i++){
            String a=words[i];
            ans+=numWords(a,brokenLetters);
        }
        return words.length - ans;
    }
    public static int numWords(String a, String bl){
        while(bl!=""){
            if(a.contains(String.valueOf(bl.charAt(0))))
                return 1;
            bl=bl.substring(1,bl.length());
        }
        return 0;
    }
}