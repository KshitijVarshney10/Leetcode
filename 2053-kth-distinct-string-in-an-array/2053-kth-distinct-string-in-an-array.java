class Solution {
    public String kthDistinct(String[] arr, int k) {
        String ans="";
        Map<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            String a=arr[i];
            int count=map.getOrDefault(a,0);
            map.put(a,count+1);
        }
        for(Map.Entry<String,Integer> mapElement : map.entrySet()) {
            String key=mapElement.getKey();
            int value=mapElement.getValue();
            if(value==1){  
                k-=1; 
                if(k==0)
                    ans=key;
            }
            // System.out.print(key+" "+value+"    ");
        }
     return ans;   
    }
}