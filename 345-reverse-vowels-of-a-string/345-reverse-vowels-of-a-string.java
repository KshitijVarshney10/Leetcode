class Solution {
    public String reverseVowels(String s) {
        String ans="";
        char[] str=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<=j){
            char beg=str[i];
            char end=str[j];
            
            if(beg=='a'||beg=='A'||beg=='e'||beg=='E'||beg=='i'||beg=='I'||beg=='o'||beg=='O'||beg=='u'||beg=='U'){
                if(end=='a'||end=='A'||end=='e'||end=='E'||end=='i'||end=='I'||end=='o'||end=='O'||end=='u'||end=='U'){
                    char t=beg;
                    str[i]=end;
                    str[j]=t;
                    i++;j--;
                }
                else{
                    j--;
                }
            }
            else if(end=='a'||end=='A'||end=='e'||end=='E'||end=='i'||end=='I'||end=='o'||end=='O'||end=='u'||end=='U'){
                if(beg=='a'||beg=='A'||beg=='e'||beg=='E'||beg=='i'||beg=='I'||beg=='o'||beg=='O'||beg=='u'||beg=='U'){
                    char t=beg;
                    str[i]=end;
                    str[j]=t;
                    i++;j--;
                }
                else{
                    i++;
                }       
            }
            else{
                i++;
                j--;     
            }
           
        }
        for(int k=0;k<str.length;k++){
            ans+=str[k];
        }
        return ans;
    }
}