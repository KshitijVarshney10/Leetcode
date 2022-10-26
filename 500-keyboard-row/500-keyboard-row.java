class Solution {
    public String[] findWords(String[] words) {
        int c=0;
        String w="";
        Set<Character> row1=new HashSet<>();
        Set<Character> row2=new HashSet<>();
        Set<Character> row3=new HashSet<>();
        
        row1.add('q');row1.add('w');row1.add('e');row1.add('r');row1.add('t');
        row1.add('y');row1.add('u');row1.add('i');row1.add('o');row1.add('p');
        
        row2.add('a');row2.add('s');row2.add('d');row2.add('f');row2.add('g');
        row2.add('h');row2.add('j');row2.add('k');row2.add('l');
        
        row3.add('z');row3.add('x');row3.add('c');row3.add('v');
        row3.add('b');row3.add('n');row3.add('m');
        
        for(int i=0;i<words.length;i++){
            String temp=words[i].toLowerCase();
            int t=0;
            while(temp!=""){
                if(row1.contains(temp.charAt(0))){
                    t++;
                }
                if(row2.contains(temp.charAt(0))){
                    t+=2;
                }
                if(row3.contains(temp.charAt(0))){
                    t--;
                }
                temp=temp.substring(1,temp.length());
            }
            if(t==words[i].length() || t==2*words[i].length() || t==(-1)*words[i].length()){
                w+=words[i]+" ";
                c++;
            }
        }
        if(w.length()==0)
            return new String[0];
        String[] ans=w.split(" ");
        return ans;
    }
}