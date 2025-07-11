package leetcode.prefixsum

/**
 * 1732. Find the Highest Altitude
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
 *
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
 *
 *
 *
 * Example 1:
 *
 * Input: gain = [-5,1,5,0,-7]
 * Output: 1
 * Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
 * Example 2:
 *
 * Input: gain = [-4,-3,-2,-1,4,3,2]
 * Output: 0
 * Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
 *
 *
 * Constraints:
 *
 * n == gain.length
 * 1 <= n <= 100
 * -100 <= gain[i] <= 100
 */
/*
1. DEF
    - altitude array will be given
    - return max altitude
    - each index i, i + 1
    - altitude starts from zero
    - not sorted array will be given
    - array can't be empty

2. BOUNDARIES
    - Integer array should be given
    - return integer
    - not null

3. TEST CASES
    [-5,1,5,0,-7] -> 1
        [0,-5,-4,1,1,-6] -> 1

    [1] -> 1
    [-1] -> 0

4. PSEUDO CODE
    var altitude = 0
    var maxAlt = 0
    loop through gain:
        altitude += gain[i]
        if (altitude > maxAlt):
            maxAlt = altitude

    return maxAlt

 */
class FindTheHighestAltitudeSolution {
    fun largestAltitude(gain: IntArray): Int {
        var altitude = 0
        var maxAltitude = 0
        for (i in 0 until gain.size) {
            altitude += gain[i]
            if (altitude > maxAltitude) {
                maxAltitude = altitude
            }
        }

        return maxAltitude
    }
}