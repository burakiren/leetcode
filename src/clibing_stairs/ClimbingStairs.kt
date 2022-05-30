package clibing_stairs


/*
    You are climbing a staircase. It takes n steps to reach the top.

    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



    Example 1:

    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps
    Example 2:

    Input: n = 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step


    Constraints:

    1 <= n <= 45
 */
class ClimbingStairs {
    fun climbStairs(n: Int): Int {
        var answers = Array(n + 2) { it }
        for (i in 3 until answers.size) answers[i] = answers[i - 2] + answers[i - 1]
        return answers[n]
    }
}