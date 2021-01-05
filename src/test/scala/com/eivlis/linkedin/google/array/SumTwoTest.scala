package com.eivlis.linkedin.google.array

import org.scalatest.FunSuite

class SumTwoTest extends FunSuite {

  test("if array is null, return false") {
    assert(SumTwo.check(null, 1) == false)
    assert(SumTwo.betterCheck(null, 1) == false)
  }

  test("if array is empty, return false") {
    assert(SumTwo.check(new Array[Int](0), 1) == false)
    assert(SumTwo.betterCheck(new Array[Int](0), 1) == false)
  }

  test("if array has 1 item, return false") {
    assert(SumTwo.check(Array(1), 1) == false)
    assert(SumTwo.betterCheck(Array(1), 1) == false)
  }

  test("if array has 2 items and the sum is not equal to k, return false") {
    assert(SumTwo.check(Array(1, 1), 1) == false)
    assert(SumTwo.betterCheck(Array(1, 1), 1) == false)
  }

  test("if array has 2 items and the sum is equal to k, return true") {
    assert(SumTwo.check(Array(1, 1), 2) == true)
    assert(SumTwo.betterCheck(Array(1, 1), 2) == true)
  }

  test("if array has more items and a sum of an item is equal to k, return false") {
    assert(SumTwo.check(Array(1, 2), 4) == false)
    assert(SumTwo.betterCheck(Array(1, 2), 4) == false)
  }

  test("if array has more items and a sum of two is not equal to k, return false") {
    assert(SumTwo.check(Array(1, 1, 1), 3) == false)
    assert(SumTwo.betterCheck(Array(1, 1, 1), 3) == false)
  }

  test("if array has more items and a sum of two is equal to k, return true") {
    assert(SumTwo.check(Array(1, 1, 2), 3) == true)
    assert(SumTwo.betterCheck(Array(1, 1, 2), 3) == true)
  }
}
