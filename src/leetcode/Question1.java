package leetcode;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
	You can return the answer in any order.


 */

public class Question1 {
    public int[] twoSum(int[] nums, int target) {
        int a = 0, b = 0;
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++){
            a = i;
            for(int j = i + 1; j < nums.length; j++){
                b = j;
                if (nums[a] + nums[b] == target){
                    answer[0] = a;
                    answer[1] = b;
                }
            }
        }
        return answer;
    }
}
