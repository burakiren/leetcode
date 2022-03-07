package plusOne

import java.math.BigInteger

class PlusOne {

    /*
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

        Increment the large integer by one and return the resulting array of digits.



        Example 1:

        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Incrementing by one gives 123 + 1 = 124.
        Thus, the result should be [1,2,4].
        Example 2:

        Input: digits = [4,3,2,1]
        Output: [4,3,2,2]
        Explanation: The array represents the integer 4321.
        Incrementing by one gives 4321 + 1 = 4322.
        Thus, the result should be [4,3,2,2].
        Example 3:

        Input: digits = [9]
        Output: [1,0]
        Explanation: The array represents the integer 9.
        Incrementing by one gives 9 + 1 = 10.
        Thus, the result should be [1,0].


        Constraints:

        1 <= digits.length <= 100
        0 <= digits[i] <= 9
        digits does not contain any leading 0's.
     */

    fun plusOne(digits: IntArray): IntArray {
        val updatedDigits = (digits.joinToString().replace(", ", "").toBigInteger().plus(BigInteger.ONE)).toString()
        return IntArray(updatedDigits.length) {
            updatedDigits[it].toString().toInt()
        }
    }

    fun plusOne2(digits: IntArray): IntArray {
        var newDigits = digits
        var interval = 1
        val lastNumber = newDigits[newDigits.size - 1]
        return if(lastNumber < 9){
            newDigits[newDigits.size - interval] = lastNumber + 1
            newDigits
        } else {
            while(newDigits[newDigits.size - interval] == 9) {
                newDigits[newDigits.size - interval] = 0
                if(newDigits.size - (interval + 1) >= 0) {
                    interval++
                }else {
                    newDigits[newDigits.size - interval] = 0
                    newDigits = append(newDigits, 0, 1)
                    interval++
                    break
                }

            }
            newDigits[newDigits.size - interval] = newDigits[newDigits.size - interval] + 1
            newDigits
        }

    }

    private fun append(arr: IntArray, element: Int, index: Int): IntArray {
        val list: MutableList<Int> = arr.toMutableList()
        list.add(index, element)
        return list.toIntArray()
    }
}