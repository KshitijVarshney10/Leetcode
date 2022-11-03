class Solution {
    public int longestPalindrome(String[] words) 
    {
        int maxLen=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(String word : words){
            StringBuilder sb=new StringBuilder(word);
            //sb.append(word);
            String reverse=sb.reverse().toString();
            if(map.containsKey(reverse)){
                maxLen+=word.length()+reverse.length();
                map.put(reverse,map.get(reverse)-1);
                if(map.get(reverse)==0)
                    map.remove(reverse);
            }
            else{
                int count=map.getOrDefault(word,0);
                map.put(word,count+1);
            }
        }
        for(String word : map.keySet()){ 
            StringBuilder sb=new StringBuilder(word);
            //sb.append(word);
            String reverse=sb.reverse().toString(); 
            if(word.equals(reverse) && map.get(word)==1){
                maxLen+=word.length();
                break;
            }
        }
        return maxLen;
    }
}


















































// class Solution {
//     public int longestPalindrome(String[] words) {
//         int ans=0;int max=0;
//         for(int i=0;i<words.length;i++){
//             String a=words[i];
//             if(index(words,rev(a)) && i!=indexPos(words,rev(a))){
//                 ans+=a.length();
//             }
//             else if(isPalin(a)){
//                 if(max<a.length())
//                     max=a.length();
//             }
//         }
//         return ans+max;
//     }
//     public static String rev(String a){
//         int j=a.length()-1;
//         String res="";
//         while(j>-1){
//             res+=a.charAt(j);
//             j--;
//         }
//         return res;
//     }
//     public static boolean isPalin(String a){
//         int i=0,j=a.length()-1;
//         while(i<=j){
//             if(a.charAt(i)!=a.charAt(j))
//                 return false;
//             i++;
//             j--;
//         }
//         return true;
//     }
//     public static boolean index(String[] ar, String t){
//         for(int i=0;i<ar.length;i++){
//             if(ar[i].equals(t))
//                 return true;
//         }
//         return false;
//     }
//     public static int indexPos(String[] ar, String t){
//         for(int i=0;i<ar.length;i++){
//             if(ar[i].equals(t))
//                 return i;
//         }
//         return -1;
//     }
// }