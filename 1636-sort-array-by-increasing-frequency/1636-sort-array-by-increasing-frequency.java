class Solution {
    public int[] frequencySort(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();    
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int[] freq = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            freq[i] = map.get(nums[i]);
        }
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - i - 1; j++) {

                if (freq[j] > freq[j + 1] ||
                   (freq[j] == freq[j + 1] && nums[j] < nums[j + 1])) {

                    int temp = freq[j];
                    freq[j] = freq[j + 1];
                    freq[j + 1] = temp;

                    int temp1 = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp1;
                }
            }
        }

        return nums;
    }
}