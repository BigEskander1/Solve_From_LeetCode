import java.util.HashMap;
class DuplicateElement {
    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicate = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int count = duplicate.getOrDefault(nums[i], 0);
            duplicate.put(nums[i], count + 1);        }
        
        for (int i = 0; i < nums.length ; i++) {
            if (duplicate.get(nums[i]) > 1) return true ;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        System.out.println( hasDuplicate(nums) );

        int[] nums2 = {1, 2, 3, 4};
        System.out.println( hasDuplicate(nums2) );

        boolean isDublicated = hasDuplicate(nums2);
    }
}