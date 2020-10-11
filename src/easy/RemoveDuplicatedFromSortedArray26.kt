package easy

class RemoveDuplicatedFromSortedArray26 {

    fun removeDuplicates(nums: IntArray): Int {

        var duplicated = nums.groupBy { it }
        var keyList = duplicated.keys.toList()

        for (i in 0..keyList.size - 1) {
            nums[i] = keyList[i]
        }
        return duplicated.size

    }
}