class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = Arrays.stream(strs)
                .collect(Collectors.groupingBy(
                        str -> str.chars()
                                  .mapToObj(c -> (char) c)
                                  .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                )).values()
                .stream()
                .collect(Collectors.toList());
            return result;
        }
}
