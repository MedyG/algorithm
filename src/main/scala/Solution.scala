
object Solution {
  def main(args: Array[String]): Unit = {
    //    println(permute(Array(1, 1, 2)))
    //    println(permuteUnique(Array(1, 1,2,2)))
    //    println(trap(Array(0,1,0,2,1,0,1,3,2,1,2,1)))
    //
    //    val node1 = new ListNode(1)
    //    val node2 = new ListNode(0)
    //    val node3 = new ListNode(1)
    //
    //    node1.next = node2
    //    node2.next = node3
    //
    //    println(getDecimalValue(node1))

    //    println(rob(Array(1,2,3,1)))

    //    println(combinationSum(Array(2, 7, 6, 3, 5, 1), 9))

    (1 to 10).foreach(i => println(countAndSay(i)))

  }


  /**
    * 1 is read off as "one 1" or 11.
    * 11 is read off as "two 1s" or 21.
    * 21 is read off as "one 2, then one 1" or 1211.
    *
    * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
    * You can do so recursively, in other words from the previous member read off the digits, counting the number of digits in groups of the same digit.
    *
    * Note: Each term of the sequence of integers will be represented as a string.
    *
    * 来源：力扣（LeetCode）
    * 链接：https://leetcode-cn.com/problems/count-and-say
    * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * @param n
    * @return
    */
  def countAndSay(n: Int): String = {

    def count(s:String): String = {
      var say = ""
      var cnt = 1
      var c: Char = s(0)
      var i = 1
      while (i < s.length) {
        if (s(i) == c) cnt += 1
        else {
          say += cnt.toString + c
          c = s(i)
          cnt = 1
        }
        i += 1
      }
      say += cnt.toString + c
      say
    }
    var say = "1"
    var i = 1
    while (i < n) {
      say = count(say)
      i += 1
    }
    say
  }

  /**
    * Write a function that reverses a string. The input string is given as an array of characters char[].
    * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
    * You may assume all the characters consist of printable ascii characters.
    *
    * 来源：力扣（LeetCode）
    * 链接：https://leetcode-cn.com/problems/reverse-string
    * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * @param s
    */
  def reverseString(s: Array[Char]): Unit = {

    var i = 0
    var j: Int = s.length - 1
    var tmp: Char = ' '
    while (i < j) {
      tmp = s(i)
      s(i) = s(j)
      s(j) = tmp

      i += 1
      j -= 1
    }
    s.reverse
  }


  /**
    * Given two arrays of integers nums1 and nums2, return the number of triplets formed (type 1 and type 2) under the following rules:
    *
    * Type 1: Triplet (i, j, k) if nums1[i]^2 == nums2[j] * nums2[k] where 0 <= i < nums1.length and 0 <= j < k < nums2.length.
    * Type 2: Triplet (i, j, k) if nums2[i]^2 == nums1[j] * nums1[k] where 0 <= i < nums2.length and 0 <= j < k < nums1.length.
    *  
    * 来源：力扣（LeetCode）
    * 链接：https://leetcode-cn.com/problems/number-of-ways-where-square-of-number-is-equal-to-product-of-two-numbers
    * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * @param nums1
    * @param nums2
    * @return
    */
  def numTriplets(nums1: Array[Int], nums2: Array[Int]): Int = {

    def triplets(nums1: Array[Int], nums2: Array[Int]): Int = {
      var square:Map[Long, Int] = Map()
      nums1.foreach((num: Int) => {
        val sq: Long = num * num.toLong
        square ++= Map(sq -> (1 + square.getOrElse(sq, 0)))
      })
      var i = 0
      var cnt = 0
      while (i < nums2.length - 1) {
        var j: Int = i + 1
        while (j < nums2.length) {
          val s: Long = nums2(i) * nums2(j).toLong
          if (square.keySet.contains(s)) cnt += square(s)
          j += 1
        }
        i += 1
      }

      cnt
    }

    triplets(nums1, nums2) + triplets(nums2, nums1)
  }


  /**
    * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
    * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
    * It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
    *
    * Example 1:
    *
    * Input: candidates = [2,3,6,7], target = 7
    * Output: [[2,2,3],[7]]
    * Explanation:
    * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
    * 7 is a candidate, and 7 = 7.
    * These are the only two combinations.
    *
    * 来源：力扣（LeetCode）
    * 链接：https://leetcode-cn.com/problems/combination-sum
    * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * @param candidates
    * @param target
    * @return
    */
  def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {

    // sort the candidates to make sure they are increasing
    //    scala.util.Sorting.quickSort(candidates)
    val candidatesSorted: Array[Int] = candidates.sorted
    var combinations: List[List[Int]] = List[List[Int]]()

    // backtracking
    def helper(i: Int, remain: Int, res: List[Int]): Unit = {
      // exit
      if (i > candidatesSorted.length - 1) return

      // look up candidates
      var j: Int = i
      while (j < candidatesSorted.length) {
        remain - candidatesSorted(j) match {
          // pruning
          case d if d < 0 => j = candidatesSorted.length
          // match target
          case d if d == 0 => combinations = (candidatesSorted(j) :: res) :: combinations
          // keep searching
          case d if d > 0 => helper(j, d, candidatesSorted(j) :: res)
        }
        j += 1
      }
    }

    helper(0, target, Nil)
    combinations
  }

  /**
    * You are a professional robber planning to rob houses along a street.
    * Each house has a certain amount of money stashed.
    * All houses at this place are arranged in a circle.
    * That means the first house is the neighbor of the last one.
    * Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
    *
    * Given a list of non-negative integers nums representing the amount of money of each house,
    * return the maximum amount of money you can rob tonight without alerting the police.
    * Input: nums = [1,2,3,1]
    * Output: 4
    * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
    * Total amount you can rob = 1 + 3 = 4.
    *
    * 来源：力扣（LeetCode）
    * 链接：https://leetcode-cn.com/problems/house-robber-ii
    * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    *
    * @param nums
    * @return
    */
  def rob(nums: Array[Int]): Int = {
    if (nums.length == 1) return nums(0)
    val n: Int = nums.length

    val dp: Array[Int] = Array.ofDim[Int](n)

    // rob without last
    dp(0) = nums(0)
    dp(1) = math.max(nums(0), nums(1))
    var i = 2
    while (i < n - 1) {
      dp(i) = math.max(dp(i - 1), dp(i - 2) + nums(i))
      i += 1
    }
    val max1 = dp(n - 2)

    // rob without head
    dp(0) = 0
    dp(1) = nums(1)
    i = 2
    while (i < n) {
      dp(i) = math.max(dp(i - 1), dp(i - 2) + nums(i))
      i += 1
    }

    math.max(max1, dp(n - 1))
  }

  /**
    * https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
    *
    * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
    * Return the decimal value of the number in the linked list.
    * Input: head = [1,0,1]
    * Output: 5
    * Explanation: (101) in base 2 = (5) in base 10
    *
    * @param head
    * @return
    */
  def getDecimalValue(head: ListNode): Int = {
    var node: ListNode = head
    var s = 0
    while (node != null) {
      s = (s << 1) + node.x
      node = node.next
    }
    s
  }

  /**
    * https://leetcode-cn.com/problems/trapping-rain-water/
    * Given n non-negative integers representing an elevation map where the width of each bar is 1,
    * compute how much water it is able to trap after raining.
    *
    * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
    * Output: 6
    *
    * @param height array of heights
    * @return
    */
  def trap(height: Array[Int]): Int = {
    if (height.length <= 2) return 0
    var water = 0
    var h1 = 0
    var h2 = 0
    var i = 0
    while (i < height.length) {

      h1 = math.max(h1, height(i))
      h2 = math.max(h2, height(height.length - i - 1))
      water = water + h1 + h2
      i += 1
    }

    water - height.length * h1 - height.sum
  }


  /**
    * https://leetcode.com/problems/permutations-ii/
    * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
    *
    * @param nums
    * @return
    */
  def permuteUnique(nums: Array[Int]): List[List[Int]] = {
    if (nums.isEmpty) return List(List[Int]())
    scala.util.Sorting.quickSort(nums)

    @scala.annotation.tailrec
    def permuteUnique(pos: Int, permutaion: List[List[Int]]): List[List[Int]] = {
      if (pos >= nums.length) return permutaion
      val num: Int = nums(pos)
      var result = List[List[Int]]()
      permutaion.foreach(
        (list: List[Int]) => {
          var jumped = false
          for (i <- 0 until pos + 1) {
            if (nums(i) != num) {
              jumped = false
              result = result ::: List(
                list.take(i) ::: List(num) ::: list.takeRight(pos - i)
              )
            }
            else if (!jumped) {
              jumped = true
              result = result ::: List(list.take(i) ::: List(num) ::: list.takeRight(pos - i))
            }

          }
        }

      )
      permuteUnique(pos + 1, result)
    }

    permuteUnique(1, List(List(nums(0)))).toList
  }

  /**
    * https://leetcode.com/problems/permutations/
    * Given a collection of distinct integers, return all possible permutations.
    *
    * @param nums
    * @return
    */
  def permute(nums: Array[Int]): List[List[Int]] = {
    if (nums.isEmpty) return List(List[Int]())

    @scala.annotation.tailrec
    def permute(pos: Int, permutaion: List[List[Int]]): List[List[Int]] = {
      if (pos >= nums.length) return permutaion
      val num: Int = nums(pos)
      var result = List[List[Int]]()
      permutaion.foreach(
        (list: List[Int]) =>
          for (i <- 0 until pos + 1) {
            result = result ::: List(
              list.take(i) ::: List(num) ::: list.takeRight(pos - i)
            )
          }
      )
      permute(pos + 1, result)
    }

    permute(1, List(List(nums(0))))
  }

  /**
    * https://leetcode.com/problems/valid-sudoku/
    * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    *
    * Each row must contain the digits 1-9 without repetition.
    * Each column must contain the digits 1-9 without repetition.
    * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
    *
    * @param board
    * @return
    */
  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    val grid = Array.ofDim[Boolean](3, 3, 9)

    for (i <- 0 until 9) {
      val existRow = Array.ofDim[Boolean](9)
      val existCol = Array.ofDim[Boolean](9)
      for (j <- 0 until 9) {
        val (x, y) = (i / 3, j / 3)
        if (board(i)(j) != '.') {
          val k: Int = board(i)(j).toInt - 49
          if (!existRow(k)) existRow(k) = true
          else return false
          if (!grid(x)(y)(k)) grid(x)(y)(k) = true
          else return false
        }
        if (board(j)(i) != '.') {
          val k = board(j)(i).toInt - 49
          if (!existCol(k)) existCol(k) = true
          else return false
        }
      }
    }
    true
  }

  /**
    * https://leetcode.com/problems/implement-strstr/
    *
    * @param haystack
    * @param needle
    * @return
    */
  def strStr(haystack: String, needle: String): Int = {
    val l: Int = needle.length
    var head = 0
    while (head + l <= haystack.length) {
      if (haystack.substring(head, head + l) == needle) return head
      head += 1
    }
    -1
  }

  /**
    * https://leetcode.com/problems/container-with-most-water/
    * Given n non-negative integers a1, a2, ..., an ,
    * where each represents a point at coordinate (i, ai).
    * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
    * Find two lines, which together with x-axis forms a container,
    * such that the container contains the most water.
    *
    * @param height
    * @return
    */
  def maxArea(height: Array[Int]): Int = {
    var max = 0
    //    for (i <- height.indices){
    //      val curH: Int = height(i)
    //      if (curH > 0) {
    //        val maxI: Int = i - max / curH
    //        for (j <- 0 until maxI) {
    //          val c: Int = (i - j) * math.min(curH, height(j))
    //          max = math.max(max, c)
    //        }
    //      }
    //    }
    var left = 0
    var right: Int = height.length - 1
    while (left < right) {
      max =
        math.max(max, math.min(height(left), height(right)) * (right - left))
      if (height(left) < height(right)) {
        left += 1
      } else {
        right -= 1
      }

    }
    max
  }

  /**
    * https://leetcode.com/problems/search-insert-position/
    * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    *
    * You may assume no duplicates in the array.
    *
    * @param nums
    * @param target
    * @return
    */
  def searchInsert(nums: Array[Int], target: Int): Int = {
    var i = 0
    nums.foreach((n: Int) => {
      if (n < target) {
        i += 1
      } else {
        return i
      }
    })
    i
  }

  /**
    * https://leetcode.com/problems/merge-k-sorted-lists/
    * Merge k sorted linked lists and return it as one sorted list.
    * Analyze and describe its complexity.
    *
    * @param lists sorted lists
    * @return
    */
  def mergeKLists(lists: Array[ListNode]): ListNode = {
    if (lists.isEmpty) return null
    if (lists.length == 1) return lists(0)
    if (lists.length == 2) return mergeTwoLists(lists(0), lists(1))
    var l: ListNode = lists.head
    lists.tail.foreach((list: ListNode) => {
      l = mergeTwoLists(l, list)
    })
    l
  }

  /**
    * https://leetcode.com/problems/merge-two-sorted-lists/
    * Merge two sorted linked lists and return it as a new list.
    * The new list should be made by splicing together the nodes of the first two lists.
    * * Definition for singly-linked list.
    * * class ListNode(var _x: Int = 0) {
    * *   var next: ListNode = null
    * *   var x: Int = _x
    * * }
    *
    * @param l1 l1
    * @param l2 l2
    * @return
    */
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 == null) return l2
    if (l2 == null) return l1
    var curl1: ListNode = l1
    var curl2: ListNode = l2
    val l: ListNode = if (curl1._x <= curl2._x) {
      val begin: Int = curl1._x
      curl1 = curl1.next
      new ListNode(begin)
    } else {
      val begin: Int = curl2._x
      curl2 = curl2.next
      new ListNode(begin)
    }

    var curl: ListNode = l
    while (curl1 != null && curl2 != null) {
      if (curl1._x <= curl2._x) {
        curl.next = new ListNode(curl1._x)
        curl = curl.next
        curl1 = curl1.next
      } else {
        curl.next = new ListNode(curl2._x)
        curl = curl.next
        curl2 = curl2.next
      }
    }
    while (curl1 != null) {
      curl.next = new ListNode(curl1._x)
      curl = curl.next
      curl1 = curl1.next
    }
    while (curl2 != null) {
      curl.next = new ListNode(curl2._x)
      curl = curl.next
      curl2 = curl2.next
    }
    l
  }

  /**
    * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
    * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
    * Input: "23"
    * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
    *
    * @param digits like "234234"
    * @return
    */
  def letterCombinations(digits: String): List[String] = {
    if (digits.length == 0) return List()
    val queue = new scala.collection.mutable.Queue[String]
    val alpha = new scala.collection.mutable.HashMap[Char, List[String]]
    alpha.put('2', List("a", "b", "c"))
    alpha.put('3', List("d", "e", "f"))
    alpha.put('4', List("g", "h", "i"))
    alpha.put('5', List("j", "k", "l"))
    alpha.put('6', List("m", "n", "o"))
    alpha.put('7', List("p", "q", "r", "s"))
    alpha.put('8', List("t", "u", "v"))
    alpha.put('9', List("w", "x", "y", "z"))
    if (digits.length == 1) return alpha(digits(0))
    queue ++= alpha(digits(0))
    digits
      .substring(1)
      .foreach((c: Char) => {
        var l: Int = queue.length
        while (l > 0) {
          val head: String = queue.dequeue()
          queue ++= alpha(c).map((a: String) => head + a)
          l -= 1
        }
      })
    queue.toList
  }

  /**
    * https://leetcode.com/problems/palindrome-number/
    * Determine whether an integer is a palindrome.
    * An integer is a palindrome when it reads the same backward as forward.
    * Input: 121
    * Output: true
    *
    * @param x like 121
    * @return
    */
  def isPalindrome(x: Int): Boolean = {
    if (x < 0) return false
    val s = x.toString
    s == s.reverse
  }

  /**
    * https://leetcode.com/problems/3sum/
    * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
    * Find all unique triplets in the array which gives the sum of zero.
    * fixed a and then the problem is a 2sum problem
    */
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val threesum = scala.collection.mutable.Set[List[Int]]()
    scala.util.Sorting.quickSort(nums)
    if (nums.length < 3) {
      return threesum.toList
    }
    if (nums.count((r: Int) => r == 0) >= 3) threesum += List(0, 0, 0)
    if (!nums.exists((r: Int) => r > 0)) return threesum.toList
    if (!nums.exists((r: Int) => r < 0)) return threesum.toList

    var i = 0
    while (i < nums.length - 2) {
      val a: Int = nums(i)
      var j: Int = i + 1
      var k: Int = nums.length - 1
      while (j < k) {
        val sum: Int = -nums(j) - nums(k)
        if (sum < a) {
          k -= 1
        } else if (sum > a) {
          j += 1
        } else {
          val b: Int = nums(j)
          val c: Int = nums(k)
          threesum += List(a, b, c)

          while (j < k && nums(j) == b) j += 1
          //          while (j < k && nums(k) == c) k -= 1

        }
      }
      while (i + 1 < nums.length && nums(i) == nums(i + 1)) i += 1
      i += 1
    }
    threesum.toList
  }
}
