import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] twoSum = {3, 5, 2, 3, 4, 5};
        int[] result = twoSum(twoSum, 7);
        System.out.println(result[0] + ", " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{}; 
    }
}
