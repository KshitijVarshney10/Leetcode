class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freq=new HashMap<Integer,Integer>();
        for (int i=0; i<arr.length; i++){
            int key=arr[i];
            if (freq.containsKey(key)){
                int count=freq.get(key);
                count++;
                freq.put(key,count);
            } 
            else{
                freq.put(key, 1);
            }
        }
        HashSet<Integer> set=new HashSet<Integer>();
        freq.forEach((key,value) -> {
            set.add(value);
        });
        return freq.size()==set.size()?true:false;
    }
}