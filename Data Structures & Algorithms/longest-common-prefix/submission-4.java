class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lo = strs[0], hi = strs[0];
        for (String s : strs) {
            if (s.compareTo(lo) < 0)
                lo = s;
            if (s.compareTo(hi) > 0)
                hi = s;
        }
        int i = 0;
        while (i < lo.length() && i < hi.length() && lo.charAt(i) == hi.charAt(i)) i++;
        return lo.substring(0, i);
    }
}