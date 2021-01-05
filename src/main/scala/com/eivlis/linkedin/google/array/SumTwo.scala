package com.eivlis.linkedin.google.array

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 */
object SumTwo {


  def check(array: Array[Int], k: Int): Boolean =
    common(array, k, (array, k) => {
      val results = for ((x, i) <- array.zipWithIndex; (y, j) <- array.zipWithIndex if i != j; if x + y == k)
        yield (x, y)
      results.length != 0
    })


  def betterCheck(array: Array[Int], k: Int): Boolean =
    common(array, k, (array, k) => {
      val helperMap = array.zipWithIndex.toMap

      val results = for((x, i) <- array.zipWithIndex if helperMap.get(k-x).filter(_ != i).isDefined)
        yield x
      results.length != 0
    })


  private def common(array: Array[Int], k: Int, fun: (Array[Int], Int) => Boolean): Boolean = {
    if (array == null || array.length < 2) {
      false
    }
    else {
      fun.apply(array, k)
    }
  }
}
