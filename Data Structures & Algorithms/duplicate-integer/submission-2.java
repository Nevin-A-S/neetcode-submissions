class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicateSet = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toSet());
        return nums.length != duplicateSet.size();
    }
}