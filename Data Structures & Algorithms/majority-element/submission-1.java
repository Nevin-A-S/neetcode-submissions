class Solution {
    public int majorityElement(int[] nums) {
        int largest = 0, count = 0;

        for (int num : nums) {
            if (count == 0) {
                largest = num;
            }
            count += (num == largest) ? 1 : -1;
        }
        return largest;
    }
}