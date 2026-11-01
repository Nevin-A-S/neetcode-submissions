class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        int length = 0;
        for (int i = 0 ; i < strs.length ; i++){
            if (i == 0) {
                answer = strs[0];
                length = strs[0].length();
                continue;
            }
            if (strs[i].length() == 0){
                answer = "";
                length = 0;
            }
            for (int j = 0 ; j < strs[i].length() ; j++){
                if (j <= (length - 1) && strs[i].charAt(j) != answer.charAt(j)){
                    answer = strs[i].substring(0,j);
                    length = j;
                }
                if (j == strs[i].length() -1  && length > j) {
                    answer = strs[i];
                    length = j;
                }

            }
        }
        return answer;
    }
}