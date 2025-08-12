class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character, String> map = new HashMap <>();
        Map<String, Character> reverseMap = new HashMap <>();

        String [] words = s.split (" ");

        if (pattern.length() != words.length){
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words [i];

            if (map.containsKey(c)){
                if (!map.get(c).equals(word)){
                    return false;
                } 
            } else {
                map.put (c, word);
            }

            if (reverseMap.containsKey(word)){
                if (!reverseMap.get(word).equals(c)){
                    return false;
                }
            } else {
                reverseMap.put (word, c);
            }
        }
        return true;
    }
}
