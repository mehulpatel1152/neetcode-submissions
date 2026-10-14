class MedianFinder {
     ArrayList<Integer> val=null;
    public MedianFinder() {
         val = new ArrayList<>();
    }
    
    public void addNum(int num) {
        int i;
        for(i=0;i<val.size();i++){
            if(num<val.get(i))break;
        }
        val.add(i,num);
        
    }
    
    public double findMedian() {
        if(val.size()==1)return val.get(0);
        else if(val.size()%2!=0)return val.get(val.size()/2);
        else return (double) ( val.get(val.size()/2) + val.get(val.size()/2-1))/2.0;
    }
}
