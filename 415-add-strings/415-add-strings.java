class Solution {
    public String addStrings(String num1, String num2) {
         String c="";
            for(int i=0;i<Math.abs(num1.length()-num2.length());i++) 
                c+="0";
            if(num1.length()<num2.length())
                num1=c+num1;                          
            else
                num2=c+num2;                          
        
        int carry=0;
        int sum=0;
        String ans="";
        for(int i=num1.length()-1,j=num2.length()-1;i>=0;i--,j--){
            
            sum+=Integer.parseInt(String.valueOf(num1.charAt(i)))+
                 Integer.parseInt(String.valueOf(num2.charAt(j)))+carry;
            
            
            if(sum>=0 && sum<=9){
                carry=0;
            }
            else if(sum>=10){
                int q=sum;
                sum=q%10;
                carry=q/10;
            }
            ans=sum+ans; 
            sum=0;
        }
        ans=carry+ans;
        if(ans.charAt(0)=='0')
            ans=ans.substring(1,ans.length());
        return ans;
    }
}