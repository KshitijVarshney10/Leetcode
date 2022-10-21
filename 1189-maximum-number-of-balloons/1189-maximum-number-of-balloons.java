class Solution {
    public int maxNumberOfBalloons(String text) {
//         HashMap<Character, Integer> map=new HashMap<>();
//         map.put('b',0);map.put('a',0);
//         map.put('l',0);map.put('o',0);
//         map.put('n',0);  
        int b=0,a=0,l=0,o=0,n=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='b') 
                b+=1;
            else if(text.charAt(i)=='a') 
                a+=1;
            else if(text.charAt(i)=='l') 
                l+=1;
            else if(text.charAt(i)=='o') 
                o+=1;
            else if(text.charAt(i)=='n') 
                n+=1;
        }
//         int b=map.get('b');
//         int a=map.get('a');
//         int o=map.get('o');
//         int l=map.get('l');
//         int n=map.get('n');
        
        return Math.min(Math.min(o/2, l/2), Math.min(Math.min(b, a), n));
    }
}