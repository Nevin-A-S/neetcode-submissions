class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> occurance = new HashMap<Integer,Integer>();
        int largest = 0;
        int count = 0;
        for (int num:nums){
            occurance.put(num, occurance.getOrDefault(num, 0)+1);
            if (occurance.get(num) > count){
                largest = num;
                count = occurance.get(num);
                }
            }
        return largest;
    }
}