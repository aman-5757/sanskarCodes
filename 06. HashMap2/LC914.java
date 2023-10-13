class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int ele : deck){
            if(hm.containsKey(ele)){
                int val = hm.get(ele);
                hm.put(ele , val + 1);
            }
            else{
                hm.put(ele, 1);
            }
        }
        
        for(int ele : deck){
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        }
    }
}