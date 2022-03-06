package plusOne

class PlusOne {

    fun plusOne(digits: IntArray): IntArray {
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