class Solution {
    
    public boolean matchFreq(HashMap<Character, Integer> newHm, String word){
        for(char ch : word.toCharArray()){
            if(newHm.containsKey(ch)){
                newHm.put(ch, newHm.get(ch) - 1);
                if(newHm.get(ch) == 0){
                    newHm.remove(ch);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
    
    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : chars.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0 )+1);
        }
        
        for(String word : words){
            HashMap<Character, Integer> newHm = new HashMap<>(hm);
            if(matchFreq( newHm,word)){
                ans += word.length();
            }
        }
        
        return ans;
        
    }
}