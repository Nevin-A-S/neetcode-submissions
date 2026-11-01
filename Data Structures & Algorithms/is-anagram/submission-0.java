class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> stringOneMap = new HashMap<Character,Integer>();
        HashMap<Character,Integer> stringTwoMap = new HashMap<Character,Integer>();
        for (int i = 0 ; i< s.length() ; i++ ){
            stringOneMap.merge(s.charAt(i), 1, Integer::sum);
            stringTwoMap.merge(t.charAt(i), 1, Integer::sum);
        }
        return stringOneMap.equals(stringTwoMap);

    }
}
