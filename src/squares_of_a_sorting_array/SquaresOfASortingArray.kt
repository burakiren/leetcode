package squares_of_a_sorting_array

import kotlin.math.absoluteValue


/*
    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



    Example 1:

    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].
    Example 2:

    Input: nums = [-7,-3,2,3,11]
    Output: [4,9,9,49,121]


    Constraints:

    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums is sorted in non-decreasing order.


    Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */
class SquaresOfASortingArray {

    fun sortedSquaresEasy(nums: IntArray) = nums.map { it*it }.sorted().toIntArray()

    fun sortedSquares(nums: IntArray): IntArray {
        var start = 0
        var end = nums.lastIndex
        val result = IntArray(nums.size)

        for (i in nums.size - 1 downTo 0) {
            val startAbsValue = nums[start].absoluteValue
            val endAbsValue = nums[end].absoluteValue

            result[i] = if (startAbsValue > endAbsValue) {
                start++
                startAbsValue * startAbsValue
            } else {
                end--
                endAbsValue * endAbsValue
            }
        }

        return result
    }

}