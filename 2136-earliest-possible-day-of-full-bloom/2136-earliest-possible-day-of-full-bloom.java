class Solution {
     public int earliestFullBloom(int[] plantTime, int[] growTime) {
        List<Integer> indice=new ArrayList<>();
        for (int i=0; i<plantTime.length; i++) 
            indice.add(i);
        Collections.sort(indice,Comparator.comparingInt(a->-growTime[a]));
        int res=0, totalPlantTime=0;
        for (int i : indice){
            totalPlantTime+=plantTime[i];
            res=Math.max(res, totalPlantTime+growTime[i]);
        }
        return res;
    }
   
}