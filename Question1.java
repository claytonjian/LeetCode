import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for(int a = 0; a < nums.length; a++){
            numbers.put(nums[a], a);
        }
        for(int a = 0; a < nums.length; a++){
            int complement = target - nums[a];
            if(numbers.containsKey(complement) && numbers.get(complement) != a){
                return new int[] { a, numbers.get(complement) };
            }
        }
        return null;
    }
}