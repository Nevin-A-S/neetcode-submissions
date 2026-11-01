class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicateSet = new HashSet<Integer>();
        for (int i = 0 ; i < nums.length ; i++){
            duplicateSet.add(nums[i]);
        }
        boolean equal = nums.length != duplicateSet.size();
        return equal;
    }
}