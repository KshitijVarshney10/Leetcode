class MedianFinder{
    ArrayList<Integer> l;
    
    public MedianFinder(){
        l=new ArrayList<>();
    }
    public void addNum(int num){
        int n=l.size();
        int i=0;
        if(n==0){
            l.add(num);
        }
        //adding in increasing order
        else{
            while(i<l.size() &&  l.get(i)<num){
                i++;
            }
            l.add(i,num);
        }
    }
    public double findMedian(){
        int n=l.size();
        if(n%2!=0){
            return (double)l.get(n/2);
        }
        else{
            return (double)(l.get((n/2)-1)+l.get(n/2))/2;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */