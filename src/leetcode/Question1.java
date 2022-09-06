package leetcode;

import java.util.HashMap;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
	You can return the answer in any order.


 */

public class Question1 {
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
