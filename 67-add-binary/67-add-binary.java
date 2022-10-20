class Solution {
    public String addBinary(String a, String b){
        String c="";
        for(int i=0;i<Math.abs(a.length()-b.length());i++)
            c+="0";
        if(a.length()<b.length())
            a=c+a;
        else
            b=c+b;
        int carry=0;
        int sum=0;
        String ans="";
        for(int i=a.length()-1,j=b.length()-1;i>=0;i--,j--){
            sum+=Integer.parseInt(String.valueOf(a.charAt(i)))+
                 Integer.parseInt(String.valueOf(b.charAt(j)))+carry;
            if(sum==0 || sum==1){
                carry=0;
            }
            else if(sum==2){
                sum=0;
                carry=1;
            }
            else if(sum==3){
                sum=1;
                carry=1; 
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
/*
a+b+carry
0+0+0 = 0
0+0+1 = 1
0+1+0 = 1
0+1+1 = 0  1   (2)
1+0+0 = 1
1+0+1 = 0  1   (2)
1+1+0 = 0  1   (2)
1+1+1 = 1  1   (3)
*/