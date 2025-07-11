package hackerrank.gettingstarted

/**
 * 412. Fizz Buzz
 * Given an integer n, return a string array answer (1-indexed) where:
 *
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 *
 *
 * Example 1:
 *
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * Example 2:
 *
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * Example 3:
 *
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */
class FizzBuzz() {
    fun fizzBuzz(n: Int): List<String> {
        val list = ArrayList<String>()
        for (index in (1..n)) {
            val text = when {
                index % 3 == 0 && index % 5 == 0 -> "FizzBuzz"
                index % 3 == 0 -> "Fizz"
                index % 5 == 0 -> "Buzz"
                else -> index.toString()
            }
            list.add(text)
        }
        return list
    }
}