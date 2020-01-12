package TwoSum;

import java.util.Hashtable;

/**
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();
        int i = 0;
        while ((i < nums.length) && (hashTable.get(nums[i]) == null)) {
            hashTable.put(target - nums[i], i);
            i++;
        }
        if (i < nums.length) {
            return new int[]{hashTable.get(nums[i]),i};
        }
        return null;
    }}
