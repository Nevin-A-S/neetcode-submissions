class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> positionMap = new HashMap<Integer,Integer>();

        for (int i = 0 ; i< nums.length ; i++){
            int component = target - nums[i];
            if (positionMap.containsKey(component)) {
                return  new int[]{positionMap.get(component), i};
            }
            positionMap.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
