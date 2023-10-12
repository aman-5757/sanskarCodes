class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        
        HashSet<Integer> hs = new HashSet<>();
        for(int ele : nums){
            hs.add(ele);
        }
        
        for(int i = 0; i < nums.length; i++){
            int ele = nums[i];
            if(!hs.contains(ele)){
                continue;
            }
            
            int ple = ele - 1;
            int pre = ele + 1;
            
            hs.remove(ele);
            while(hs.contains(ple)){
                hs.remove(ple);
                ple--;
            }
            
            while(hs.contains(pre)){
                hs.remove(pre);
                pre++;
            }
            
            ans = Math.max(ans, pre-ple-1);
        }
        return ans;
    }
}