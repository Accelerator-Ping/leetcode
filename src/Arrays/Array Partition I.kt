package Arrays

/**
 *  561.Array Partition I
 *
 *  Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

    Example 1:
    Input: [1,4,3,2]

    Output: 4
        Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
    Note:
        1. n is a positive integer, which is in the range of [1, 10000].
        2.All the integers in the array will be in the range of [-10000, 10000].
 */
import java.util.Arrays

class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        Arrays.sort(nums)

        var sum = 0
        var i = 0
        while (i < nums.size) {
            sum += nums[i]
            i += 2
        }
        return sum
    }
}

 /**
  *    思路：
  *      让两对数中最小的相加的和最大。 类似于田忌赛马，用最好的马和最坏的马在一对中肯定不合适。
  *
  *      我的想法是让其中插值最接近的两个为一对。尽可能的保留较大值。
  *      如：(1,2) ， (3,4)肯定优于(1,3) (2,4).3在后者被浪费了
  *
  *      还有更优的算法...
  *
  *
  *
  */