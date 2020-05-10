
object Solution {
  def main(args: Array[String]): Unit = {
    //    println(permute(Array(1, 1, 2)))
    //    println(permuteUnique(Array(1, 1,2,2)))


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
        (list: List[Int]) =>{
          var jumped = false
          for (i <- 0 until pos + 1) {
            if (nums(i) != num) {
              jumped = false
              result = result ::: List(
                list.take(i) ::: List(num) ::: list.takeRight(pos - i)
              )
            }
            else if (!jumped){
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
