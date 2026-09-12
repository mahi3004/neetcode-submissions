class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,(map.getOrDefault(i,0)+1));
        }
        int[] ans=new int[k];
        
        for(int i=0;i<k;i++){
        int max=Integer.MIN_VALUE;
        int element=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                element=entry.getKey();
            }
        }
        ans[i]=element;
        map.remove(element);
        }
        return ans;
    }
}
