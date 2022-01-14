class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size - 1){
            for (j in 0 until nums.size - 1) {
                if (i != j && nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }

        return intArrayOf(-1)
    }

    fun twoSumButBetter(nums: IntArray, target: Int): IntArray {
        //Work in progress
        for (i in 0 until nums.size - 1){
            for (j in 0 until nums.size - 1) {
                if (i != j && nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }

        return intArrayOf(-1)
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val example1: IntArray = intArrayOf(2, 7, 11, 15)
    val example2: IntArray = intArrayOf(3, 2, 4)
    val example3: IntArray = intArrayOf(3, 3)

    println(solution.twoSum(example1, 9).contentToString())
    println(solution.twoSum(example2, 6).contentToString())
    println(solution.twoSum(example3, 6).contentToString())
}