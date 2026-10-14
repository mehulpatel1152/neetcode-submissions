class TimeMap {

    HashMap<String,ArrayList<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))map.put(key,new ArrayList<>());

        map.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        ArrayList<Pair> lst = map.get(key);
        if(lst==null)return "";
        int i=0,j=lst.size()-1;
        String ans="";
        while(i<=j){
            int mid = i + (j - i)/2;
            if(lst.get(mid).timeStamp<=timestamp){
                i=mid+1;
                ans = lst.get(mid).value;
            }
            else j=mid-1;
            
        }
        
        return ans;
    }
}

class Pair{
    int timeStamp;
    String value;

    public Pair(int timeStamp,String value){
        this.timeStamp=timeStamp;
        this.value=value;
    }
}