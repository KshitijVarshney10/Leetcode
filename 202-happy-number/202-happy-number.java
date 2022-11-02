class Solution {
    public boolean isHappy(int n) {
        int ans=n;
        while(ans!=1){
            int sum=0;
            n=ans;
            while(n>0){
                int r=n%10;
                sum+=Math.pow(r,2);
                n=n/10;
            }
            ans=sum;
             System.out.println(ans);
            if(ans<10){
                if(ans!=1 && ans!=7)
                    return false;
                if(ans==7)
                    return true;
            }
           
        }
        return true;
    }
}