package romanToInteger13

class RomanToInteger {


    fun romanToInt(s: String): Int {

        var map: Map<Char, Int> = emptyMap()
        map = map.toMutableMap()
        map.put('I', 1)
        map.put('V', 5)
        map.put('X', 10)
        map.put('L', 50)
        map.put('C', 100)
        map.put('D', 500)
        map.put('M', 1000)

        var total = 0
        for (index in s.indices) {

            val currentValue = map.get(s.get(index))!!

            if (index != s.length - 1) {
                val nextValue = map.get(s.get(index + 1))!!
                if (nextValue > currentValue) {
                    total -= currentValue
                } else {
                    total += currentValue
                }

            } else {
                total += currentValue
            }

        }
        return total

    }
}
