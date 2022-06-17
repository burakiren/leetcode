package valid_anagram

import kotlin.math.absoluteValue


/*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



    Example 1:

    Input: s = "anagram", t = "nagaram"
    Output: true
    Example 2:

    Input: s = "rat", t = "car"
    Output: false


    Constraints:

    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.
 */
class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val sHash = hashMapOf<Char, Int>()
        val tHash = hashMapOf<Char, Int>()

        for (i in s.indices){
            sHash[s[i]] = sHash.getOrDefault(s[i], 0) + 1
            tHash[t[i]] = tHash.getOrDefault(t[i], 0) + 1
        }

        return sHash == tHash
    }
}