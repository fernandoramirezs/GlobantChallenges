package TwoSum;

import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.add(2);
        twoSum.add(7);
        twoSum.add(11);
        twoSum.add(15);

        int target = 9;
        boolean result = twoSum.find(target);

        System.out.println("Output: " + result);
    }
    private HashMap<Integer, Integer> nums;

    public TwoSum() {
        nums = new HashMap<>();
    }

    public void add(int number) {
        // Store the number and its frequency in the HashMap
        nums.put(number, nums.getOrDefault(number, 0) + 1);
    }

    public boolean find(int target) {
        // Iterate through the HashMap
        for (int num : nums.keySet()) {
            int complement = target - num;

            // Check if the complement exists in the HashMap and it's not the same number
            if (nums.containsKey(complement) && (complement != num || nums.get(complement) > 1)) {
                return true;
            }
        }

        // No pair found
        return false;
    }

}



