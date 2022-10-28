class Solution {
    public int addDigits(int num) {
        int k=sumD(num);
        while(k>=10)
            k=sumD(k);
        return k;
    }
    public static int sumD(int num){
        int sum=0;
        while(num>0){
            int r=num%10;
            sum+=r;
            num=num/10;
        }
        return sum;
    }
}