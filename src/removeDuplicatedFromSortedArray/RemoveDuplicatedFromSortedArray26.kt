package removeDuplicatedFromSortedArray

class RemoveDuplicatedFromSortedArray26 {

    fun removeDuplicates(nums: IntArray): Int {

        var duplicated = nums.groupBy { it }
        var keyList = duplicated.keys.toList()

        for (i in keyList.indices) {
            nums[i] = keyList[i]
        }
        return duplicated.size

    }
}